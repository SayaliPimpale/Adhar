package com.AdharValidation1.controller;

import java.util.HashMap;

import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AdharValidation1.model.Adhar;
import com.AdharValidation1.service.Adharservice;

@RestController
public class AdharController {

	@Autowired
	private Adharservice services;

	@SuppressWarnings("unchecked")
	@PostMapping("/AdharVerification")
	public HashMap<String, Object> getUserApi(@RequestBody Adhar adhar) throws ParseException
	{
		System.out.println("without toString()" + adhar);
		String str =  this.services.consumeApi(adhar);
		JSONParser parser = new JSONParser(str);  
		HashMap<String, Object> json = (HashMap<String, Object>) parser.parse();
		
	    return json ;
	}
	
	
	
}
