package org.gksqls.jeews.wechat.menu;

import com.google.gson.Gson;

public class Menu {
	
	private Button[] button;  
	  
    public Button[] getButton() {  
        return button;  
    }  
  
    public void setButton(Button[] button) {  
        this.button = button;  
    }
    
    public String toJson(){
		return new Gson().toJson(this);
    }
}
