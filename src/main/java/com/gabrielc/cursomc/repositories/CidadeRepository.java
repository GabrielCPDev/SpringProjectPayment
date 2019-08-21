package com.gabrielc.cursomc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabrielc.cursomc.domain.Cidade;
import com.gabrielc.cursomc.domain.Estado;



@Repository
public interface CidadeRepository extends JpaRepository<Estado, Integer>{

	void saveAll(List<Cidade> asList);

}
