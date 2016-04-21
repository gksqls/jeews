package org.gksqls.jeews.wechat.message.request;

public class VoiceMsg extends BaseMsg {
	
	private static final long serialVersionUID = -3384755959420674745L;
	private String MediaId;
	private String Format;
	
	public String getMediaId() {
		return MediaId;
	}
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
	public String getFormat() {
		return Format;
	}
	public void setFormat(String format) {
		Format = format;
	}
	
	public String toXml(){
    	xstream.alias("xml", this.getClass()); 
    	return xstream.toXML(this);
    }
	
}
