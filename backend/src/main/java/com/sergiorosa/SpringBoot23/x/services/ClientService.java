package com.sergiorosa.SpringBoot23.x.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sergiorosa.SpringBoot23.x.dto.ClientDTO;
import com.sergiorosa.SpringBoot23.x.entities.Client;
import com.sergiorosa.SpringBoot23.x.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll(){
		List<Client> list =  repository.findAll();
		
		return  list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional<Client> obj = repository.findById(id);
		Client entity =  obj.get();
		return new ClientDTO(entity);
	
	}
}













