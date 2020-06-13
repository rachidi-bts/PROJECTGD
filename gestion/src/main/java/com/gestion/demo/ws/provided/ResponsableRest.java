package com.gestion.demo.ws.provided;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.demo.bean.Responsable;
import com.gestion.demo.service.facade.ResponsableService;

@RestController
@RequestMapping("GestionDocument/Responsable")
@CrossOrigin(origins = { "http://localhost:4200" })
public class ResponsableRest {

	@Autowired
	private ResponsableService responsableService;

	public int save(@RequestBody Responsable responsable) {
		return responsableService.save(responsable);
	}

	public List<Responsable> findAll() {
		return responsableService.findAll();
	}

	public Responsable findByLogin(String login) {
		return responsableService.findByLogin(login);
	}

	public int deleteByLogin(String login) {
		return responsableService.deleteByLogin(login);
	}
	
}