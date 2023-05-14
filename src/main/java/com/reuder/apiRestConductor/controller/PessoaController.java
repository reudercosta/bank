package com.reuder.apiRestConductor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.reuder.apiRestConductor.model.Pessoa;
import com.reuder.apiRestConductor.service.PessoaService;
@Controller
@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	@Autowired
	PessoaService pessoaService;
	
	@RequestMapping(method=RequestMethod.POST, value = "/salvar")
	public ResponseEntity<?> salvar(@RequestBody Pessoa pessoa){
		Pessoa p = pessoaService.salvar(pessoa);
		return new ResponseEntity<>(p, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/listar")
	public ResponseEntity<?> listar(){
		List<Pessoa> pessoas = pessoaService.listar();
		return new ResponseEntity<>(pessoas, HttpStatus.OK);
	}
}
