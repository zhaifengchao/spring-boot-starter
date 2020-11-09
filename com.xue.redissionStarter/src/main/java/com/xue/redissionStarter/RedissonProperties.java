package com.xue.redissionStarter;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix="pg.redisson")
public class RedissonProperties {

	private String host="localhost";
	private int port=6379;
	private int timeout=6379;
	private boolean ssl;
}
