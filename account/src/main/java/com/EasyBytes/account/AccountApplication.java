package com.EasyBytes.account;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@Slf4j
@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")

public class AccountApplication {

	public static void main(String[] args) {

		SpringApplication.run(AccountApplication.class, args);
		log.info("starting.......");
	}

}
