package com.kiwong.kiwong;

import com.kiwong.kiwong.config.DaoSpringconfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@SpringBootApplication
@Import({DaoSpringconfig.class})
@ComponentScan({"com.kiwong.kiwong.controller"})
public class KiwongApplication {

	public static void main(String[] args) {
		SpringApplication.run(KiwongApplication.class, args);
	}

}
