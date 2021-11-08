package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplicationForSQ {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplicationForSQ.class, args);
	}

	public void doSomething() {
	}

	public void doSomething2() {
	}

	public int doSomething3() {
		return 777;
	}
}
