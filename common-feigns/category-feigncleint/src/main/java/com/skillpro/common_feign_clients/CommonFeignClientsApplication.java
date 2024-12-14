package com.skillpro.common_feign_clients;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients
public class CommonFeignClientsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonFeignClientsApplication.class, args);
	}

}
