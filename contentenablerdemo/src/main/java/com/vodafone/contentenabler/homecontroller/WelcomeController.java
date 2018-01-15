package com.vodafone.contentenabler.homecontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vodafone.contentenabler.client.ContentEnablerProvider;

@Controller
public class WelcomeController {
	
	

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		
		Map<String, String> trans = ContentEnablerProvider.getTranslationsByOpco("DEFAULT");
		model.put("message", trans);
		return "welcome";
	}

}