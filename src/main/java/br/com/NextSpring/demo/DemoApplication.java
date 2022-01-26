package br.com.NextSpring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.NextSpring.demo.model.Produto;
import br.com.NextSpring.demo.service.ProdutoService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
	@Autowired
	private ProdutoService produtoService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Produto produto = new Produto("leite", 12);
		System.out.println(produto.getNome()+""+produto.getId());
		produtoService.create(produto);
		
	}

}
