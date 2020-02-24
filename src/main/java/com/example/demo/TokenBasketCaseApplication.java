package com.example.demo;

import com.example.demo.model.BodyMessage;
import com.example.demo.model.Item;
import com.example.demo.restclient.InstantOrderRestClient;
import com.example.demo.service.OrderCoffee;
import com.example.demo.utilities.ProjectConstants;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TokenBasketCaseApplication {


	public static void main(String[] args)  {
		SpringApplication.run(TokenBasketCaseApplication.class, args);
	}

}
