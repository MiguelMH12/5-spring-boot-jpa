package com.everis.springbootjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.springbootjpa.model.Categoria;
import com.everis.springbootjpa.model.Log;
import com.everis.springbootjpa.service.LogService;

@RestController
@RequestMapping("logs")
public class LogController {
	@Autowired
	private LogService logService;
	
	@GetMapping("/")
	public List<Log> listar(){
		return logService.listar();
	}
	
	@PostMapping("/") //Verbos HTTP
	public Log insertar(@RequestBody Log log) {
		return logService.insertar(log);
	}
	
	@PutMapping("/")
	public Log actualizar(@RequestBody Log log) {
		return logService.actualizar(log);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable String id) {
		 logService.eliminar(id);
	}
}
