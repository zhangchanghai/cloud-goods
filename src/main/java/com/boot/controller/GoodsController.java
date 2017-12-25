package com.boot.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.boot.feign.UserFeign;

@RestController
public class GoodsController {
	@Autowired
	private UserFeign userFeign;
	@Value("${server.port}")
	private String port ;
	@GetMapping("/getuser/{id}")
	public Object getUser(@PathVariable Integer id){
		Map<String, Object> map = userFeign.getUser(id);
		map.put("port : ", port);
		return map;
	}
}
