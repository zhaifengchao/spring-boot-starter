package com.xue.redissionStarter.demo1;

import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	RedissonClient redissonClient;
	
	@GetMapping("/say")
	public String say() {
		RBucket bucker = redissonClient.getBucket("name");
		if(bucker.get()==null) {
			bucker.set("xuexi");
		}
		return bucker.get().toString();
		
	}
	
	
}
