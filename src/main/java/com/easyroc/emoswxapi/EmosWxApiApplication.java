package com.easyroc.emoswxapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import javax.annotation.PostConstruct;

@SpringBootApplication
@ServletComponentScan
public class EmosWxApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmosWxApiApplication.class, args);
	}

}
