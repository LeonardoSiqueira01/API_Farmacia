package com.remedios.leo.estudo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.remedios.leo.estudo.remedio.DadosCadastroRemedio;
import com.remedios.leo.estudo.remedio.Remedio;
import com.remedios.leo.estudo.remedio.RemedioRepository;

@RestController
@RequestMapping("/remedios")
public class remedioController{

	@Autowired
	private RemedioRepository Repository;

	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroRemedio dados) {
		Repository.save(new Remedio(dados));
	}
}
