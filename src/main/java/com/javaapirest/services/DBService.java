package com.javaapirest.services;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaapirest.domain.Categoria;
import com.javaapirest.repositories.CategoriaRepository;

@Service
public class DBService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public void instantiateTestDatabase() throws ParseException {
		
		Categoria cat1 = new Categoria(null, "Açougue");
		Categoria cat2 = new Categoria(null, "Bebida");
		Categoria cat3 = new Categoria(null, "Cereais");
		
				
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		
}
}
