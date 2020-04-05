package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Account;
import com.example.demo.model.AccountRequest;
import com.example.demo.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	public Account createAccount(AccountRequest request, HttpHeaders headers) {
		Account account = new Account();
		account.setAddress(request.getAddress());
		account.setFname(request.getFname());
		account.setLname(request.getLname());
		account = accountRepository.save(account);
		
		return account;
	}

}
