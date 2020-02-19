package com.rolval.springboot.app.models.dao;

import java.util.List;
import com.rolval.springboot.app.models.entity.*;

public interface IClienteDao {
	
	public List<Cliente> findAll();
	
	public void save(Cliente cliente);
}
