package br.com.riume.helpme.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.riume.helpme.model.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
