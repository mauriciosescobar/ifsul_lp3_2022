package br.ifsul.lp3.exercicio3.components;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ifsul.lp3.exercicio3.models.Cachorro;
import br.ifsul.lp3.exercicio3.repositories.CachorroRepository;

@Component
public class CarregaDadosCachorros {

	@Autowired
	private CachorroRepository repository;

	@PostConstruct
	public void inicializa() {

		if (repository.count() == 0) {
			/*
			 * 3. Cadastrar pelo menos 6 cachorros com valores variados para os atributos
			 */
			
			Cachorro c1 = new Cachorro(null, "Bob", "Sem raça", "Preto", 10);
			Cachorro c2 = new Cachorro(null, "Juca", "Pug", "Branco", 5);
			Cachorro c3 = new Cachorro(null, "Lilica", "Doberman", "Marrom", 3);
			// e assim por diante

			repository.save(c1);
			repository.save(c2);
			repository.save(c3);
		}

		System.out.println("----------------------");
		System.out.println("Cachorros cadastrados: ");

		for (Cachorro c : repository.findAll()) {
			System.out.println(c);
		}
		
		/*
		 * Teste das operacoes criadas no exercicio 3
		 */
		
		System.out.println("\n----------------------");
		System.out.println("Exercício 3: ");
		
		System.out.println(repository.countByNome("Bob"));
		System.out.println(repository.findByIdadeAndCor(2, "Preto"));
		System.out.println(repository.findByNomeOrIdade("Bob", 5));
		System.out.println(repository.findByNomeContainingAndCor("a", "Preto"));
		System.out.println(repository.findFirstByOrderByIdadeAsc());
		System.out.println(repository.findByNomeContaining("a"));
		System.out.println(repository.findByNomeStartsWith("L"));
		System.out.println(repository.findByIdadeBetween(2, 9));
		
		System.out.println("\n----------------------");
	}
}
