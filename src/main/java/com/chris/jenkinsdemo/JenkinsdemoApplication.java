package com.chris.jenkinsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsdemoApplication.class, args);
	}



	@Bean
	public ClientConfig hazelcastClientConfig() {
		ClientConfig clientConfig = new ClientConfig();
		clientConfig.getNetworkConfig().addAddress("hazelcast");
		return clientConfig;
	}

}
