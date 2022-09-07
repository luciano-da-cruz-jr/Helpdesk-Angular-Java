package com.luciano.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luciano.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
