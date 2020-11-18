package com.assignment.mdm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@EnableJpaRepositories({
        "com.assignment.mdm.repository"
})
@EntityScan({
        "com.assignment.mdm.model"
})
@ComponentScan(basePackages = {
        "com.assignment.mdm.mapper",
        "com.assignment.mdm.util",
        "com.assignment.mdm.controller",
        "com.assignment.mdm.service",
        "com.assignment.mdm.configuration",
})
public class MdmApplication {

    public static void main(String[] args) {
        SpringApplication.run(MdmApplication.class, args);
    }

}
