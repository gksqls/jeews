package org.gksqls.jeews.wechat.message.response;

import java.util.List;

public class NewsMsg extends BaseMsg{
	private static final long serialVersionUID = -626590902234711614L;
	private int ArticleCount;  
    private List<Article> Articles;  
  
    public int getArticleCount() {  
        return ArticleCount;  
    }  
  
    public void setArticleCount(int articleCount) {  
        ArticleCount = articleCount;  
    }  
  
    public List<Article> getArticles() {  
        return Articles;  
    }  
  
    public void setArticles(List<Article> articles) {  
        Articles = articles;  
    }
    
    public String toXml(){
    	xstream.alias("xml", this.getClass()); 
    	return xstream.toXML(this);
    }
}
