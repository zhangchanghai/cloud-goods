package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.boot.feign")
@EnableCircuitBreaker
public class GoodsApp {

	public static void main(String[] args) {
		SpringApplication.run(GoodsApp.class, args);
		System.out.println("====cloud-goods 启动完毕====");
	}

}
