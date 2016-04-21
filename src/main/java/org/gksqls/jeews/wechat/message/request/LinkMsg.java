package org.gksqls.jeews.wechat.message.request;

public class LinkMsg extends BaseMsg{
	
	private static final long serialVersionUID = 5541348439686635614L;
	private String Title;  
    private String Description;  
    private String Url;
    
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}  
	
	public String toXml(){
    	xstream.alias("xml", this.getClass()); 
    	return xstream.toXML(this);
    }
    
}
