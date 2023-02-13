package com.project.publish;

import com.project.publish.remote.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PublishApplication {

	@Autowired
	private Producer producer;
	public static void main(String[] args) {
		SpringApplication.run(PublishApplication.class, args);

	}

}
