package org.gksqls.jeews.wechat.message.response;

import java.io.Serializable;

import org.gksqls.jeews.support.wechat.XmlSupport;

public class BaseMsg extends XmlSupport implements Serializable{
	
	private static final long serialVersionUID = 4833129144838976089L;
	
	private String ToUserName;  
    private String FromUserName;  
    private long CreateTime;  
    private String MsgType;  
    private int FuncFlag;
    
	public String getToUserName() {
		return ToUserName;
	}
	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}
	public String getFromUserName() {
		return FromUserName;
	}
	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}
	public long getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(long createTime) {
		CreateTime = createTime;
	}
	public String getMsgType() {
		return MsgType;
	}
	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
	public int getFuncFlag() {
		return FuncFlag;
	}
	public void setFuncFlag(int funcFlag) {
		FuncFlag = funcFlag;
	} 
	
	public String toXml(){
    	xstream.alias("xml", this.getClass()); 
    	return xstream.toXML(this);
    }
    
}
