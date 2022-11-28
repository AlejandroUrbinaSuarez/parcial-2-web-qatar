package com.example.qatar.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.qatar.model.Estadio;

public interface EstadioRepository extends JpaRepository<Estadio, Integer>{
	public List<Estadio> findById(Integer id);
}
