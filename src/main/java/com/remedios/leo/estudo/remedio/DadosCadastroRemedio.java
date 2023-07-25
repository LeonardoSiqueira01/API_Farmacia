package com.remedios.leo.estudo.remedio;

public record DadosCadastroRemedio(
	String nome,
	Via via,
	String lote,
	String quantidade,
	Laboratorio laboratorio) {
}
