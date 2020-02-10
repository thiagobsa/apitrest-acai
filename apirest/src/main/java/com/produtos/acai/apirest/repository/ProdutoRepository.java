package com.produtos.acai.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.acai.apirest.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	Produto findById(long id);
	
}
