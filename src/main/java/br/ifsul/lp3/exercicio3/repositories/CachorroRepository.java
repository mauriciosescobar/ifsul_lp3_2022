package br.ifsul.lp3.exercicio3.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ifsul.lp3.exercicio3.models.Cachorro;

/*
 * 2. Declarar um Repository para a entidade Cachorro
 */
public interface CachorroRepository extends JpaRepository<Cachorro, Integer> {

	/*
	 * 4.Implementar as seguintes consultas atraves de query methods
	 */

	/*
	 * 4.1. Retornar o numero de cachorros com um determinado nome (nome exato)
	 */
	Integer countByNome(String nome);

	/*
	 * 4.2. Retornar todos os cachorros de uma determinada idade E cor;
	 */
	List<Cachorro> findByIdadeAndCor(Integer idade, String cor);

	/*
	 * 4.3. Retornar todos os cachorros de um nome OU idade;;
	 */
	List<Cachorro> findByNomeOrIdade(String nome, Integer idade);

	/*
	 * 4.4. Retornar todos os cachorros de um determinado nome (ou combinacao) E
	 * cor;
	 */
	List<Cachorro> findByNomeContainingAndCor(String nome, String cor);

	/*
	 * 4.5. Retornar o cachorro mais novo
	 */
	Cachorro findFirstByOrderByIdadeAsc();

	/*
	 * 4.6. Retornar todos os cachorros cujo nome contenha determinada String
	 */
	List<Cachorro> findByNomeContaining(String nome);

	/*
	 * 4.7. Retornar todos os cachorros cujo nome comece com determinada String
	 */
	List<Cachorro> findByNomeStartsWith(String nome);

	/*
	 * 4.8. Retornar todos os cachorros cuja idade esteja entre um valor inicial e
	 * um valor final;
	 */
	List<Cachorro> findByIdadeBetween(Integer idadeInicial, Integer idadeFinal);
}
