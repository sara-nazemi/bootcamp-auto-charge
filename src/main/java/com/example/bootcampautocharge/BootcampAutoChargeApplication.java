package com.example.bootcampautocharge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@EnableTransactionManagement
@EnableJpaRepositories
@EnableMongoRepositories
@EntityScan
@EnableAspectJAutoProxy
@EnableAsync
@EnableCaching
public class BootcampAutoChargeApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootcampAutoChargeApplication.class, args);
    }

}
