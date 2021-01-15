package com.sergiorosa.SpringBoot23.x.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sergiorosa.SpringBoot23.x.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
