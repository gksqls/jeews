package org.gksqls.jeews.wechat.message.request;

public class ImageMsg extends BaseMsg{
	
	private static final long serialVersionUID = 6769401710783386418L;
	private String PicUrl;

	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}
	
	public String toXml(){
    	xstream.alias("xml", this.getClass()); 
    	return xstream.toXML(this);
    }
	
}
