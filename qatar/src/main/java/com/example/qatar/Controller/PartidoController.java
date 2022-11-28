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

import com.example.qatar.model.Resultado;
import com.example.qatar.model.Estadio;
import com.example.qatar.model.Partido;
import com.example.qatar.repository.PartidoRepository;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/partidos")
public class PartidoController {
	@Autowired
	PartidoRepository partidoRepository;
	
	@GetMapping
	public List<Partido> getPartidoAll() {

		return partidoRepository.findAll();
	}
	
	@GetMapping("/{id}/resultados")
	public List<Partido> getPartidosConResultadoAll() {

		return partidoRepository.findAll();
	}
	
}
