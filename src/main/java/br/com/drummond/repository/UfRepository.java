package br.com.drummond.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.drummond.domain.Uf;

@Repository
public interface UfRepository extends JpaRepository<Uf, Integer> {
	
	// Referencia JPA Query:
	// https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
	
	List<Uf> findByOrderByUfDescricao();

}
