package com.skc.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class HomeController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${appServerURL}")
	private String appServer;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	
	@GetMapping("/home")
	public String greeting( Model model) {
		model.addAttribute("name", "sample");
		return "home";
	}
	
	@GetMapping("/")
	public String home( Model model) throws JsonMappingException, JsonProcessingException {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		String str = restTemplate.exchange(appServer, HttpMethod.GET, entity, String.class).getBody();
		 ArrayList<Map<String,String>> list = objectMapper.readValue(str,  ArrayList.class);
		model.addAttribute("branchList", list);
		return "index";
	}
	
}
