package org.gksqls.jeews.wechat.message.handle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.gksqls.jeews.support.common.exception.PushException;
import org.gksqls.jeews.support.common.http.Results;

/**
 * Handler push message
 * @author G.N.E
 *
 */
public abstract class PushHandle extends Results implements Push {
	
	/**
	 * {@inheritDoc}
	 */
	public String textMsg(PushTemplate template) throws PushException {
		return template.getTextMsg().toXml();
	}
	
	/**
	 * {@inheritDoc}
	 */
	public String newsMsg(PushTemplate template) throws PushException {
		return template.getNewsMsg().toXml();
	}
	
	/**
	 * {@inheritDoc}
	 */
	public String musicMsg(PushTemplate template) throws PushException {
		return template.getMusicMsg().toXml();
	}
	
	/**
	 * Init wechat interface
	 * @param request
	 * @param response
	 */
	public abstract void init(HttpServletRequest request, HttpServletResponse response);
	
	/**
	 * Handler wechat server message or push message
	 * @param request
	 * @param response
	 */
	public abstract void handler(HttpServletRequest request, HttpServletResponse response);
	

}
