package com.example.qatar.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.qatar.model.Seleccion;
import com.example.qatar.repository.SeleccionRepository;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/selecciones")

public class SeleccionController {
	@Autowired
	SeleccionRepository seleccionRepository;
	
	@GetMapping
	public List<Seleccion> getProductoAll() {

		return seleccionRepository.findAll();
	}
	
	@GetMapping("/grupo/{grupo}")
	public Seleccion getSeleccionByGrupo(@PathVariable String grupo) {
		
		Optional<Seleccion> seleccion = seleccionRepository.findByGrupo(grupo);
		
		if (producto.isPresent()) {
			return producto.get();
		}
		
		return null;

	}
	
	@PostMapping
	public Seleccion postSelecciones(@RequestBody Seleccion seleccion) {
		
		seleccionRepository.save(seleccion);
		
		return seleccion;
		

	}
}
