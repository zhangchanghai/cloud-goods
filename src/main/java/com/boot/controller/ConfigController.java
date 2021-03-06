package com.boot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigController {
	@Value("${path}")
	private String path;
	@Value("${value}")
	private String value;
	@GetMapping("/getconfig")
	public Object config(){
		
		System.out.println(path+"\n"+value);
		return "path: "+path+"    ===   value:"+value;
	}
}
