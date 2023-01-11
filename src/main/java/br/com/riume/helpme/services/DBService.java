package br.com.riume.helpme.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.riume.helpme.enums.Perfil;
import br.com.riume.helpme.enums.Prioridade;
import br.com.riume.helpme.enums.Status;
import br.com.riume.helpme.model.Chamado;
import br.com.riume.helpme.model.Cliente;
import br.com.riume.helpme.model.Tecnico;
import br.com.riume.helpme.repository.ChamadoRepository;
import br.com.riume.helpme.repository.ClienteRepository;
import br.com.riume.helpme.repository.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	
	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Riume Carlos", "14094671986", "riumecarlos@gmail.com", encoder.encode("123"));
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linus troval", "66021043065", "troval@gmail.com", encoder.encode("123"));
		cli1.addPerfil(Perfil.CLIENTE);
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
		
		Tecnico tec2 = new Tecnico(null, "Vinicius", "10270411089", "vinicius@gmail.com", encoder.encode("123@123"));
		tec2.addPerfil(Perfil.ADMIN);
		
		Cliente cli2 = new Cliente(null, "jao", "60677238088", "jao@gmail.com", encoder.encode("123@456"));
		cli2.addPerfil(Perfil.CLIENTE);
		
		Chamado c2 = new Chamado(null, Prioridade.ALTA, Status.ANDAMENTO, "Chamado 02", "segundo chamado", tec2, cli2);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
		
		tecnicoRepository.saveAll(Arrays.asList(tec2));
		clienteRepository.saveAll(Arrays.asList(cli2));
		chamadoRepository.saveAll(Arrays.asList(c2));
	}
}
