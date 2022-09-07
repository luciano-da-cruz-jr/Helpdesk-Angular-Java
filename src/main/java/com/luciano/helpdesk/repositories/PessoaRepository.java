package com.luciano.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luciano.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
