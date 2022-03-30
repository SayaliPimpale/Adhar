package com.AdharValidation1.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.AdharValidation1.model.Adhar;


@Service
public class Adharservice {
	

	
	public String consumeApi(Adhar adhar) {
	HttpHeaders headers = new HttpHeaders();
	headers.add("username", "test.torus@authbridge.com");
	headers.add("Password", "India@2608");
	headers.add("Content-Type", "application/json");

	
	String url = "https://www.truthscreen.com/InstantSearch/encrypted_string";
	HttpEntity<Adhar> entity=new HttpEntity<Adhar>(adhar,headers);
	RestTemplate restTemplate = new RestTemplate();

	String responseEntity = restTemplate.postForObject(url, entity, String.class);
	System.out.println(responseEntity);
	
	Map<String, String> objMap = new HashMap<String, String>();
	
	objMap.put( "requestData", responseEntity);
	
	String url1 = "https://www.truthscreen.com/api/v2.2/idsearch";
	HttpEntity<Map<String, String>> entity1 = new HttpEntity<Map<String, String>>(objMap, headers);
	
	String responseEntity1 = restTemplate.postForObject(url1, entity1, String.class);

	System.out.println(responseEntity1);
	//Map<String,String> objMap2=new HashMap<String, String>();
	//objMap.put("request",responseEntity1);
	String url2 = "https://www.truthscreen.com/InstantSearch/decrypt_encrypted_string";
	HttpEntity<String> entity2 = new HttpEntity<String>(responseEntity1,headers);
	
	System.out.println(entity2.toString());
	
	String responseEntity2 = restTemplate.postForObject(url2, entity2, String.class);
	
	System.out.println(responseEntity2);
	
	return responseEntity2;
}

}
