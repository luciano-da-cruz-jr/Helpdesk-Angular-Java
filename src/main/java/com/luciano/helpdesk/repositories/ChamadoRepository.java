package com.luciano.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luciano.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
