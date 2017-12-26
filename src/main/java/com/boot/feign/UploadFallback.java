package com.boot.feign;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
@Component
public  class UploadFallback implements UploadFeign{

		@Override
		public Map<String,Object> handleFileUpload(MultipartFile file) {
			Map<String, Object> map = new HashMap<>();
			map.put("success", false);
			map.put("msg", "无法连接upload微服务");
			return map;
		}
    	
    }