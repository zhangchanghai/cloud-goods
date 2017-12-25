package com.boot.feign;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="cloud-user",fallback=UserFallback.class)
public interface UserFeign {
	@RequestMapping(value = "/getuser/{id}",method=RequestMethod.GET)
	public Map<String,Object> getUser(@PathVariable("id") Integer id);
}
