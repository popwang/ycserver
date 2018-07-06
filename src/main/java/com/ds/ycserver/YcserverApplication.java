package com.ds.ycserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.ds.ycserver.netty.YcNettyServer;

@SpringBootApplication
@EnableAutoConfiguration
@MapperScan("com.ds.ycserver.mysql.mapper")
public class YcserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(YcserverApplication.class, args);
	}
	
	@Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            YcNettyServer server = (YcNettyServer)ctx.getBean("ycNettyServer");
            server.starter();
        };
    }
}
