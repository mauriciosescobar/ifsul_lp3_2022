package br.ifsul.lp3;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.ifsul.lp3.exercicio1.models.Comprovante;
import br.ifsul.lp3.exercicio1.repositories.ComprovanteRepository;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Bean
	public ComprovanteRepository test(ComprovanteRepository repository) {

		Comprovante comprovante1 = new Comprovante();

		comprovante1.setDataEntrada(LocalDate.now());
		comprovante1.setDataSaida(LocalDate.now().plusDays(1));
		comprovante1.setHoraEntrada(LocalTime.now());
		comprovante1.setHoraSaida(LocalTime.now().minusHours(2));
		comprovante1.setPlaca("ABC1234");
		comprovante1.setValorTotal(new BigDecimal(30.5f));

		// Salva no banco e guarda o objeto atualizado (com o ID)
		comprovante1 = repository.save(comprovante1);

		System.out.println("ID do comprovante cadastrado: " + comprovante1.getId());

		System.out.println("--------------");
		System.out.println("Registros:");

		for (Comprovante c : repository.findAll()) {
			System.out.println(String.format("> %s %s", c.getId(), c.getPlaca()));
		}

		return repository;
	}
}
