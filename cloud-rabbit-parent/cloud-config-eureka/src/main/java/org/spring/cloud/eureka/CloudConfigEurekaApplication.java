package org.spring.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * application
 *
 * @author hejq
 * @date 2019-01-24 13:59
 */
@EnableEurekaServer
@SpringBootApplication
public class CloudConfigEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigEurekaApplication.class, args);
	}

}

