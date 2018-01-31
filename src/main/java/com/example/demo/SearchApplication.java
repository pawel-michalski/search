package com.example.demo;

import java.applet.AppletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.repository.FakeDocumentRepository;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.example")
public class SearchApplication {


	
	public static void main(String[] args) {
		SpringApplication.run(SearchApplication.class, args);
	
		
		
		
		
	}
}
