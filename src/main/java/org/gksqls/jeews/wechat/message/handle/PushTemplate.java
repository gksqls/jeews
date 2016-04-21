package org.gksqls.jeews.wechat.message.handle;

import java.util.Date;
import java.util.List;

import org.gksqls.jeews.wechat.constant.Message;
import org.gksqls.jeews.wechat.message.response.Article;
import org.gksqls.jeews.wechat.message.response.Music;
import org.gksqls.jeews.wechat.message.response.MusicMsg;
import org.gksqls.jeews.wechat.message.response.NewsMsg;
import org.gksqls.jeews.wechat.message.response.TextMsg;

/**
 * Push message template support
 * @author G.N.E
 *
 */
public class PushTemplate {
	/**
	 * commons content
	 */
	private String fromUserName;
	private String toUserName;
	/**
	 * Text message content
	 */
	private String content;
	
	/**
	 * Music message content
	 */
	private Music music;
	
	/**
	 * News message content
	 */
	private int articleCount;
	private List<Article> articles;
	
	/**
	 * Get text message template
	 * @return
	 */
	public TextMsg getTextMsg(){
		TextMsg msg = new TextMsg();
		msg.setToUserName(toUserName);  
		msg.setFromUserName(fromUserName);
		msg.setCreateTime(new Date().getTime());  
		msg.setMsgType(Message.RESP_MESSAGE_TYPE_TEXT);  
		msg.setFuncFlag(0); 
		msg.setContent(content);
		return msg;
	}
	
	/**
	 * Get news message template
	 * @return
	 */
	public NewsMsg getNewsMsg(){
		NewsMsg msg = new NewsMsg();
		msg.setArticleCount(articleCount);
		msg.setArticles(articles);
		return msg;
	}
	
	/**
	 * Get music message template
	 * @return
	 */
	public MusicMsg getMusicMsg(){
		MusicMsg msg = new MusicMsg();
		msg.setMusic(music);
		return msg;
	}
	

}
