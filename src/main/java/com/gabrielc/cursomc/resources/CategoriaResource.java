package com.gabrielc.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gabrielc.cursomc.domain.Cliente;
import com.gabrielc.cursomc.services.ClienteService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@Autowired
	private ClienteService service;	
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Cliente obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
		
		
	
	}
}
