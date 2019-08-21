package com.gabrielc.cursomc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabrielc.cursomc.domain.Categoria;
import com.gabrielc.cursomc.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Categoria, Integer>{

	void saveAll(List<Produto> asList);


}
