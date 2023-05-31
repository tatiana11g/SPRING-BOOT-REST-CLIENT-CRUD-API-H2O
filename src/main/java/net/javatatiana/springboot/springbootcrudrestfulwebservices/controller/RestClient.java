package net.javatatiana.springboot.springbootcrudrestfulwebservices.controller;

import org.springframework.web.client.RestTemplate;

public class RestClient {

	private static final String GET_ALL_USERS_API ="http://localhost:8080/api/users";
	private static final String GET_USERS_BY_ID_API ="http://localhost:8080/api/users/{id}";
	private static final String CREATE_USER_API ="http://localhost:8080/api/users";
	private static final String UPDATE_USER_API ="http://localhost:8080/api/users/{id}";   
	private static final String DELTE_USER_API ="http://localhost:8080/api/users/{id}";
	   
	 RestTemplate restTempleTemplate = new RestTemplate ();  
	 public static void  main (String[] args) {
		 
	 }
}
