package com.boot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	@GetMapping("/getuser2/{id}")
	public Object getUser2(@PathVariable Integer id){
		Map<String, Object> map = new HashMap<>();
		map.put("port", port);
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		map.put("list", list);
		map = userFeign.getUser2(id, map);
		return map;
	}
}
