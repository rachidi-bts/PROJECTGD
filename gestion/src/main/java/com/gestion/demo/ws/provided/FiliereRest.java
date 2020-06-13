package com.gestion.demo.ws.provided;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.demo.bean.Filiere;
import com.gestion.demo.service.facade.FiliereService;

@RestController
@RequestMapping("GestionDocument/Filiere")
@CrossOrigin(origins = { "http://localhost:4200" })
public class FiliereRest {

	@Autowired
	private FiliereService filiereService;

	@PostMapping("/")
	public int save(@RequestBody Filiere filiere) {
		return filiereService.save(filiere);
	}

	@GetMapping("/")
	public List<Filiere> findAll() {
		return filiereService.findAll();
	}

	@GetMapping("/libelle/{libelle}")
	public Filiere findByLibelle(@PathVariable String libelle) {
		return filiereService.findByLibelle(libelle);
	}

	@DeleteMapping("/libelle/{libelle}")
	public int deleteByLibelle(@PathVariable String libelle) {
		return filiereService.deleteByLibelle(libelle);
	}

}