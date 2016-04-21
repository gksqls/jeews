package org.gksqls.jeews.wechat.message.request;

public class TextMsg extends BaseMsg{
	
	private static final long serialVersionUID = 6875431851357782865L;
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
