package br.com.drummond.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.drummond.domain.Uf;

@Repository
public interface UfRepository extends JpaRepository<Uf, Integer> {

}
