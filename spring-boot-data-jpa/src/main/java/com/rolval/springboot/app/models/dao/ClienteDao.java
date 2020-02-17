package com.rolval.springboot.app.models.dao;

import java.util.List;
import com.rolval.springboot.app.models.entity.*;

public interface ClienteDao {
	
	public List<Cliente> findAll();
	
}
