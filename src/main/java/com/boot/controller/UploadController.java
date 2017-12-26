package com.boot.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.boot.feign.UploadFeign;

@RestController
public class UploadController {

	@Autowired
	private UploadFeign uploadFeign;
	@GetMapping("/")
	public Object index(ModelAndView mv){
		mv.setViewName("index");
		return mv;
	}
	@PostMapping("/upload")
	public Object upload(@RequestParam MultipartFile file){
		Map<String, Object> map = uploadFeign.handleFileUpload(file);
		System.out.println("执行完毕");
		return map;
	}
}
