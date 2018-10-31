package com.pk.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Created by pangkunkun on 2018/10/17.
 */
@SpringBootApplication(scanBasePackages = {"com.pk.first","com.pk.second"})
public class SpringFirstApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringFirstApplication.class,args);
    }
}
