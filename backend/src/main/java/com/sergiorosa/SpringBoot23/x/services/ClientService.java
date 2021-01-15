package com.sergiorosa.SpringBoot23.x.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sergiorosa.SpringBoot23.x.entities.Client;
import com.sergiorosa.SpringBoot23.x.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	public List<Client> findAll(){
		return repository.findAll();
	}
}
