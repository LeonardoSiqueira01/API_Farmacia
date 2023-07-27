package com.remedios.leo.estudo.remedio;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name = "Remedio")
@Entity(name = "remedios")
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
public class Remedio {
	public Remedio() {}
	
	public Remedio(DadosCadastroRemedio dados) {
		this.nome = dados.nome();
		this.via = dados.via();
		this.lote = dados.lote();
		this.quantidade = dados.quantidade();
		this.validade = dados.validade();
		this.laboratorio = dados.laboratorio();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@Enumerated(EnumType.STRING)
	private Via via;
	private String lote;
	private int quantidade;
	private LocalDate validade;
	@Enumerated(EnumType.STRING)
	private Laboratorio laboratorio;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Via getVia() {
		return via;
	}
	public void setVia(Via via) {
		this.via = via;
	}
	public String getLote() {
		return lote;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public LocalDate getValidade() {
		return validade;
	}
	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}
	public Laboratorio getLaboratorio() {
		return laboratorio;
	}
	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}

	
	
}
