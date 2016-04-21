package org.gksqls.jeews.wechat.message.response;

public class MusicMsg extends BaseMsg{
	private static final long serialVersionUID = -3879691966180548164L;
	private Music Music;

	public Music getMusic() {
		return Music;
	}

	public void setMusic(Music music) {
		Music = music;
	}  
	
	public String toXml(){
    	xstream.alias("xml", this.getClass()); 
    	return xstream.toXML(this);
    }
}
