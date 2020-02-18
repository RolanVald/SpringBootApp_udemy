package com.rolval.springboot.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rolval.springboot.app.models.dao.IClienteDao;

@Controller
public class ClienteController {

	@Autowired
//	@Qualifier("clienteDaoJPA")
	private IClienteDao clienteDAO;
	
	
	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("titulo", "listado de clientes");
		model.addAttribute("Clientes", clienteDAO.findAll());
		return "listar";
	}
}
