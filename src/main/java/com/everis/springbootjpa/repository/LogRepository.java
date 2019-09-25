package com.everis.springbootjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.springbootjpa.model.Log;

@Repository
public interface LogRepository extends JpaRepository<Log, String> {  //Jpa para que genere el DAO <Modelo, tipo de dato clave primaria>

}
