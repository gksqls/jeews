package org.gksqls.jeews.wechat.message.response;

import org.gksqls.jeews.support.wechat.XmlSupport;

public class Article extends XmlSupport{
	
    private String Title;  
    private String Description;  
    private String PicUrl;  
    private String Url;  
  
    public String getTitle() {  
        return Title;  
    }  
  
    public void setTitle(String title) {  
        Title = title;  
    }  
  
    public String getDescription() {  
        return null == Description ? "" : Description;  
    }  
  
    public void setDescription(String description) {  
        Description = description;  
    }  
  
    public String getPicUrl() {  
        return null == PicUrl ? "" : PicUrl;  
    }  
  
    public void setPicUrl(String picUrl) {  
        PicUrl = picUrl;  
    }  
  
    public String getUrl() {  
        return null == Url ? "" : Url;  
    }  
  
    public void setUrl(String url) {  
        Url = url;  
    }
    
    public String toXml(){
    	xstream.alias("xml", this.getClass()); 
    	return xstream.toXML(this);
    }
    
}
