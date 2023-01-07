package br.com.riume.helpme.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.riume.helpme.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
