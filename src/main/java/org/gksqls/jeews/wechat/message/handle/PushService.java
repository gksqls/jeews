package org.gksqls.jeews.wechat.message.handle;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.gksqls.jeews.support.common.Logger;
import org.gksqls.jeews.support.common.exception.PushException;
import org.gksqls.jeews.support.wechat.SignUtil;
import org.gksqls.jeews.support.wechat.XmlSupport;
import org.gksqls.jeews.wechat.constant.Message;

/**
 * Push service
 * @author G.N.E
 *
 */
public abstract class PushService extends PushHandle{
	
	private PushTemplate pushTemplate;
	private String msgType;
	
	protected void initPushTemplate(PushTemplate pushTemplate,String msgType){
		if(pushTemplate == null && msgType == null){
			throw new PushException("PushTemplate and msgType can't be null.");
		}
		this.pushTemplate = pushTemplate;
		this.msgType = msgType;
	}
	
	/**
	 * Binding servlet
	 * @param request
	 * @param response
	 */
	public void bind(HttpServletRequest request, HttpServletResponse response){
		if(request.getMethod().equals("GET")){
			init(request, response);
		}else if(request.getMethod().equals("POST")){
			handler(request, response);
		}else{
			renderText(response, "Request Bad.");
		}
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void init(HttpServletRequest request, HttpServletResponse response) {
		if(validate(request)){
			renderText(response, request.getParameter("echostr"));
		}
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void handler(HttpServletRequest request, HttpServletResponse response) {
		String result = "Request Bad.";
		try {
			Map<String, String> requestMap = XmlSupport.parseXml(request);
			String msgType = requestMap.get("MsgType");
			if (msgType.equals(Message.REQ_MESSAGE_TYPE_TEXT)) {
				result = textMsg(pushTemplate);
			}else if (msgType.equals(Message.REQ_MESSAGE_TYPE_EVENT)) {  
            	if (requestMap.get("Event").equals(Message.EVENT_TYPE_SUBSCRIBE)) {  
            		if(this.msgType.equals(Message.REQ_MESSAGE_TYPE_TEXT)){
            			result = textMsg(pushTemplate);
            		}else if(this.msgType.equals(Message.RESP_MESSAGE_TYPE_NEWS)){
            			result = newsMsg(pushTemplate);
            		}
                }
            }
			renderText(response, result);
		} catch (Exception e) {
			e.printStackTrace();
			Logger.error("Handler wechat server message or push message error %s", e);
		}
	}
	
	/**
	 * Validate wechat server sign
	 * @param request
	 * @return
	 */
	protected boolean validate(HttpServletRequest request){
		String signature = request.getParameter("signature");  
        String timestamp = request.getParameter("timestamp");  
        String nonce = request.getParameter("nonce");  
		return SignUtil.checkSignature(signature, timestamp, nonce);
	}
	
}
