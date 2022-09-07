package com.luciano.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luciano.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
