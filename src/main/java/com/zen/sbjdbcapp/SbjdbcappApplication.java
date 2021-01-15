package com.zen.sbjdbcapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbjdbcappApplication implements CommandLineRunner{

	@Autowired
	private CustomerDAO customerDAO;
	
	public static void main(String[] args) {
		SpringApplication.run(SbjdbcappApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		List<Customer> customers = customerDAO.findAll();
		for (Customer c : customers) {
		System.out.println(c.getName() + " : " +  c.getEmail());	
		}
		
	}

}
