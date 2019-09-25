package com.everis.springbootjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.springbootjpa.model.Log;
import com.everis.springbootjpa.repository.LogRepository;

@Service
public class LogService {
	@Autowired
	private LogRepository logRepository;
	
	public List<Log> listar(){
		return logRepository.findAll();
	}
	
	public Log insertar(Log log) {
		return logRepository.save(log);  //INSERT INTO
	}
	
	public Log actualizar(Log log) {
		return logRepository.saveAndFlush(log);
	}
	
	public boolean eliminar(String id ) {
		Log encontrada = logRepository.findById(id).get();
		if(encontrada != null) {
			logRepository.deleteById(id);
			return true;
		}else {
			return false;
		}
		
	}
	
}
