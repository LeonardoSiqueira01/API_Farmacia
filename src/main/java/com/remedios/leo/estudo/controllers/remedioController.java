package com.remedios.leo.estudo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.remedios.leo.estudo.remedio.DadosCadastroRemedio;
import com.remedios.leo.estudo.remedio.DadosListagemRemedios;
import com.remedios.leo.estudo.remedio.Remedio;
import com.remedios.leo.estudo.remedio.RemedioRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/remedios")
public class remedioController{

	@Autowired
	private RemedioRepository Repository;

	@PostMapping
	@Transactional //rollback dos dados caso, algum deles esteja invalido
	public void cadastrar(@RequestBody @Valid DadosCadastroRemedio dados) {
		Repository.save(new Remedio(dados));
	}
	
	@GetMapping
	public List<DadosListagemRemedios> listarRemedios(){
		return Repository.findAll().stream().map(DadosListagemRemedios::new).toList();
	}
}
