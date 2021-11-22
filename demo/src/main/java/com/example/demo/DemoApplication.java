package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.Demo2Utils;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public void doSomething() {
	}
	
	public void foo() {
		Demo3Utils.hello("test");
	}

	public void deps() {
		Demo2Utils.hello("test");
	}

}
