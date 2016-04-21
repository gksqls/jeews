package org.gksqls.jeews.wechat.message.handle;

import org.gksqls.jeews.support.common.exception.PushException;

/**
 * Push message
 * @author G.N.E
 *
 */
public interface Push {
	
	/**
	 * Push text message
	 * @param template
	 * @throws PushException
	 */
	public void textMsg(PushTemplate template) throws PushException;
	
	/**
	 * Push news message
	 * @param template
	 * @throws PushException
	 */
	public void newsMsg(PushTemplate template) throws PushException;
	
	/**
	 * push music messgae
	 * @param template
	 * @throws PushException
	 */
	public void musicMsg(PushTemplate template) throws PushException;
	
	
}
