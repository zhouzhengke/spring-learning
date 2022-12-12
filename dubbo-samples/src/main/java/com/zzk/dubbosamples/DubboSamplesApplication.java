package com.zzk.dubbosamples;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhouzhengke
 */
@SpringBootApplication
@EnableDubbo
public class DubboSamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboSamplesApplication.class, args);
	}

}
