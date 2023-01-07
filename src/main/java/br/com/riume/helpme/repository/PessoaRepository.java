package br.com.riume.helpme.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.riume.helpme.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
