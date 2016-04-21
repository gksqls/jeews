package org.gksqls.jeews.support.common.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.gksqls.jeews.support.common.Logger;

import com.google.gson.Gson;

public class Results {
	
	PrintWriter getPrintWriter(HttpServletResponse response) throws IOException{
		return response.getWriter();
	}
	
	protected void renderText(HttpServletResponse response,Object obj){
		try {
			PrintWriter out = getPrintWriter(response);
			out.println(obj.toString());
		} catch (Exception e) {
			e.printStackTrace();
			Logger.error("renderText error -> %s", e);
		}
	}
	
	protected void renderJSON(HttpServletResponse response,Object obj){
		try {
			PrintWriter out = getPrintWriter(response);
			out.println(new Gson().toJson(obj));
		} catch (Exception e) {
			e.printStackTrace();
			Logger.error("renderJSON error -> %s", e);
		}
	}
	
}
