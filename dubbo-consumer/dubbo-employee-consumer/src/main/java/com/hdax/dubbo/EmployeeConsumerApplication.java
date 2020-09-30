package com.hdax.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class EmployeeConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeConsumerApplication.class,args);
    }
}
