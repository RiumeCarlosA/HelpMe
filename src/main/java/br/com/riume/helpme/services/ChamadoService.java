package br.com.riume.helpme.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.riume.helpme.model.Chamado;
import br.com.riume.helpme.repository.ChamadoRepository;
import br.com.riume.helpme.services.exceptions.ObjectNotFoundException;

@Service
public class ChamadoService {
	
	@Autowired
	private ChamadoRepository repository;
	
	public Chamado findById(Integer id) {
		Optional<Chamado> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado: " + id));
	}

	public List<Chamado> findAll() {
		return repository.findAll();
	}
}
