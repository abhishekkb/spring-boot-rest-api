package com.example.demo.client;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Account;

@Component
public class AccountClient {

	@Value("${account.uri}")
	private String uri;

	public Account createAccount(Account account, HttpHeaders headers) throws URISyntaxException {

		RequestEntity<Account> entity = RequestEntity.post(new URI(uri))
											.headers(headers)
											.accept(MediaType.APPLICATION_JSON)
											.body(account);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Account> result = restTemplate.exchange(entity, Account.class);
		
		return result.getBody();
	}
}
