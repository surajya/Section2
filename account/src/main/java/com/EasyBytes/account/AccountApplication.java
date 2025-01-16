package com.EasyBytes.account;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Slf4j
@SpringBootApplication
public class AccountApplication {

	public static void main(String[] args) {

		SpringApplication.run(AccountApplication.class, args);
		log.info("starting.......");
	}

}
