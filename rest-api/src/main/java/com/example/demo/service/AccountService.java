package com.example.demo.service;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import com.example.demo.client.AccountClient;
import com.example.demo.model.Account;

@Service
public class AccountService {

	@Autowired
	private AccountClient accountClient;
	
	public Account createAccount(Account account, HttpHeaders headers) throws Exception {
		return accountClient.createAccount(account, headers);
	}

//	private Map<String, String> buildHeadersMap(HttpHeaders headers) {
//        Map<String, String> httpHeaders = new HashMap<>();
//        httpHeaders.put(HttpHeaders.CONTENT_TYPE, headers.getFirst(HttpHeaders.CONTENT_TYPE));
//        return httpHeaders;
//    }
}
