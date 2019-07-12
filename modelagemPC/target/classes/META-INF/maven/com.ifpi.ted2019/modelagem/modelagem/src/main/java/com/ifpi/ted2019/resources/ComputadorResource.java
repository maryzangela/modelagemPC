package com.ifpi.ted2019.resources;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ifpi.ted2019.domain.Categoria;

@RestController
@RequestMapping(value= "/computador")
public class ComputadorResource {
	
	@RequestMapping (method=RequestMethod.GET)
	public List<Computador> listar(){
		List<Computador> computadores = new ArrayList<Computador>();
		computadores.add(new Computador(1, "Dell"));
		computadores.add(new Computador(2, "HP"));
		return computadores;
		
	}
	

}
