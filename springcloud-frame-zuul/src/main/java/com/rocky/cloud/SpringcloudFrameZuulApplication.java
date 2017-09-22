package com.rocky.cloud;

import com.rocky.cloud.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class SpringcloudFrameZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudFrameZuulApplication.class, args);
	}

	/*@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}*/
}
