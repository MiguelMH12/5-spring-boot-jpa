package com.everis.springbootjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.springbootjpa.model.Categoria;
import com.everis.springbootjpa.repository.CategoriaRepository;

@Service //Agregamos un objeto de este tipo al contexto de Spring, sin él no funciona el Autowired
public class CategoriaService {
	
	//Obtiene un objeto del contexto de Spring
	//Obtiene siempre la misma instancia (Singleton)
	@Autowired  
	private CategoriaRepository categoriaRepository;  
	
	public List<Categoria> listar(){
		return categoriaRepository.findAll(); //JpaRepository SELECT * FROM categoria 
	}
	
	public Categoria insertar(Categoria categoria) {
		return categoriaRepository.save(categoria);  //INSERT INTO
	}
	
	public Categoria actualizar(Categoria categoria) {
		return categoriaRepository.saveAndFlush(categoria);
	}
	
	public boolean eliminar(int id) {
		Categoria encontrada = categoriaRepository.findById(id).get();
		if(encontrada != null) {
			categoriaRepository.deleteById(id);
			return true;
		}else {
			return false;
		}
		
	}
	
	
}
