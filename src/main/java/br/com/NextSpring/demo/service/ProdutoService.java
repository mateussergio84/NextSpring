package br.com.NextSpring.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.NextSpring.demo.model.Produto;
import br.com.NextSpring.demo.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public Produto create(Produto p) {
		return produtoRepository.save(p);
	}

}
