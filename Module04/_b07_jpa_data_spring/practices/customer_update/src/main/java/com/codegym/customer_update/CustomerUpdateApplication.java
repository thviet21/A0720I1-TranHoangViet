package com.codegym.customer_update;

import com.codegym.customer_update.formatter.ProvinceFormatter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class CustomerUpdateApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerUpdateApplication.class, args);
    }

}
