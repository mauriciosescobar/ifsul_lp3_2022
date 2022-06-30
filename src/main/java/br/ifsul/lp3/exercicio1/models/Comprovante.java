package br.ifsul.lp3.exercicio1.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// Anota a classe como sendo uma entidade persistente
@Entity
public class Comprovante {
	/**
	 * Enunciado: Realize o mapeamento objeto-relacional das seguintes entidades:
	 * Comprovante de estacionamento <br>
	 * id - chave primaria auto incrementada <br>
	 * data da entrada - Date <br>
	 * hora de entrada - Time <br>
	 * data da saida - Date <br>
	 * hora da saida - Time <br>
	 * valor total - Decimal (10, 2) <br>
	 * placa do veiculo - varchar(7)
	 */

	// Anota como chave primaria
	@Id
	// estrategia de controle do valor da chave primaria
	// nesse caso sera autoincrementada
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private LocalDate dataEntrada;
	private LocalDate dataSaida;
	private LocalTime horaEntrada;
	private LocalTime horaSaida;
	// Precisao - numero de digitos para representar todo o numero
	// Escala - numero de digitos da parte fracionaria (dentro do total da precisao)
	@Column(precision = 10, scale = 2)
	private BigDecimal valorTotal;
	@Column(length = 7)
	private String placa;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public LocalDate getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}

	public LocalTime getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(LocalTime horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public LocalTime getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(LocalTime horaSaida) {
		this.horaSaida = horaSaida;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
}
