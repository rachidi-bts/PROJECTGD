package com.gestion.demo.ws.provided;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.demo.bean.TypeFiliere;
import com.gestion.demo.service.facade.TypeFiliereService;

@RestController
@RequestMapping("/GestionDocument/TypeFiliere")
@CrossOrigin(origins = { "http://localhost:4200" })
public class TypeFilliereRest {

	@Autowired
	private TypeFiliereService typeFiliereService;

	@PostMapping("/")
	public int save(@RequestBody TypeFiliere typeFiliere) {
		return typeFiliereService.save(typeFiliere);
	}

	public TypeFiliere findByLibelle(String libelle) {
		return typeFiliereService.findByLibelle(libelle);
	}

	public int deleteByLibelle(String libelle) {
		return typeFiliereService.deleteByLibelle(libelle);
	}

	@GetMapping("/")
	public List<TypeFiliere> findAll() {
		return typeFiliereService.findAll();
	}

}