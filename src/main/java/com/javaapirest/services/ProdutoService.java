package com.javaapirest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaapirest.domain.Produto;
import com.javaapirest.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repo;
	
	public Produto find(Integer id) {
		Optional<Produto> obj = repo.findById(id);
		return obj.orElse(null);		
	}
	
	public List<Produto> findAll(){
		List<Produto> listaProduto = repo.findAll();
		return listaProduto;
	}
	
	public Produto insert(Produto obj){
		obj.setProduto_id(null);
		return repo.save(obj);
	}
	
	public Produto update(Produto obj){
		find(obj.getProduto_id());
		return repo.save(obj);
	}
	
	public void delete(Integer id){
		find(id);
		repo.deleteById(id);
	}
}
