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
import com.example.qatar.model.Seleccion;
import com.example.qatar.repository.ResultadoRepository;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/resultados")
public class ResultadoController {
	
	@Autowired
	ResultadoRepository resultadoRepository;
	
	@PostMapping
	public Seleccion postSelecciones(@RequestBody Resultado resultado) {
		
		resultadoRepository.save(resultado);
		
		return resultado;
		

	}
	
	@PutMapping("/{id}")
	public Resultado putResultadosbyId(@PathVariable Integer id, @RequestBody Resultado resultado) {
		
		Optional<Resultado> resultadoCurrent = resultadoRepository.findById(id);
		
		if (resultadoCurrent.isPresent()) {
			
			Resultado resultadoReturn = resultadoCurrent.get();
			
			
			resultadoReturn.setGoles(resultado.getGoles());
			resultadoReturn.setAmarillas(resultado.getAmarillas());
			resultadoReturn.setRojas(resultado.getRojas());
			
			
			resultadoRepository.save(resultadoReturn);
			
			return resultadoReturn;
		}
		
		return null;

	}
}
