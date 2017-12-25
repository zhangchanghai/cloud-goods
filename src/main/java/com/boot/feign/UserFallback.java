package com.boot.feign;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
@Component
public class UserFallback implements UserFeign{

	@Override
	public Map<String,Object> getUser(Integer id) {
		Map<String, Object> map = new HashMap<>();
		map.put("success", false);
		map.put("msg", "无法连接user微服务");
		return map;
	}

}
