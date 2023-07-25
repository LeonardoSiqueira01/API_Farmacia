package com.remedios.leo.estudo.remedio;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "Remedio")
@Entity(name = "remedios")
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
public class Remedio {
	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Getter
	@Setter
	private String nome;
	@Enumerated(EnumType.STRING)
	@Getter
	@Setter
	private Via via;
	@Getter
	@Setter
	private String lote;
	@Getter
	@Setter
	private String quantidade;
	@Getter
	@Setter
	@Enumerated(EnumType.STRING)
	private Laboratorio laboratorio;

}
