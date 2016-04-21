package org.gksqls.jeews.wechat.message.response;

public class TextMsg extends BaseMsg{
	private static final long serialVersionUID = 8026910804504324840L;
	private String Content;

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}  
	
	public String toXml(){
    	xstream.alias("xml", this.getClass()); 
    	return xstream.toXML(this);
    }
	
}
