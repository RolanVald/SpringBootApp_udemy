package com.rolval.springboot.app.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rolval.springboot.app.models.dao.IClienteDao;
import com.rolval.springboot.app.models.entity.Cliente;

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
	
	@GetMapping("/form")
	public String crear(Map<String, Object> model) {
		Cliente cliente = new Cliente();
		model.put("cliente", cliente);
		model.put("titulo", "Formulario de cliente");
		return "form";
	}
	
	@PostMapping("/form")
	public String guardar(Cliente cliente) {
		clienteDAO.save(cliente);
		return "redirect:listar";
	}
}
