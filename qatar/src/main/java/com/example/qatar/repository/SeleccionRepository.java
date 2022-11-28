package com.example.qatar.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.qatar.model.Seleccion;

@Repository
public interface SeleccionRepository extends JpaRepository<Seleccion, Integer>{
	public List<Seleccion> findByNombre(String nombre);
	
	public List<Seleccion> findByGrupo(String grupo);
}
