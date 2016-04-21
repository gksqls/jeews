package org.gksqls.jeews.cms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.gksqls.jeews.wechat.message.handle.PushService;
import org.gksqls.jeews.wechat.message.handle.PushTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/wechat")
@Controller
public class CoreService extends PushService{
	
	@ResponseBody
	@RequestMapping("/core")
	public void core(HttpServletRequest request,HttpServletResponse response){
		this.initPushTemplate(new PushTemplate(), "");
		bind(request, response);
	}
	
}
