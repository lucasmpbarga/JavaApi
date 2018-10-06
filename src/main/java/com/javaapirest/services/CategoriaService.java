package com.javaapirest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaapirest.domain.Categoria;
import com.javaapirest.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);		
	}
	
	public List<Categoria> findAll(){
		List<Categoria> listaCategoria = repo.findAll();
		return listaCategoria;
	}
	
	public Categoria insert(Categoria obj){
		obj.setCategoria_id(null);
		return repo.save(obj);
	}
	
	public Categoria update(Categoria obj){
		find(obj.getCategoria_id());
		return repo.save(obj);
	}
	
	public void delete(Integer id){
		find(id);
		repo.deleteById(id);
	}
}
