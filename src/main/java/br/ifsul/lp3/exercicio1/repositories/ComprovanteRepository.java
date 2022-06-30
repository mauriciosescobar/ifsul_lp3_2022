package br.ifsul.lp3.exercicio1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ifsul.lp3.exercicio1.models.Comprovante;

/*
 * extends JpaRepository < CLASSE QUE REPRESENTA A ENTIDADE, TIPO DE DADO DA CHAVE PRIMARIA > 
 */
public interface ComprovanteRepository extends JpaRepository<Comprovante, Integer> {

}
