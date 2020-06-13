package com.gestion.demo.ws.provided ;


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

import com.gestion.demo.bean.Demmandeur;
import com.gestion.demo.service.facade.DemmandeurService;

@RestController
@RequestMapping("GestionDocument/Demmandeur")
@CrossOrigin(origins = {"http://localhost:4200"})
public class DemmandeurRest {

 @Autowired 
 private DemmandeurService demmandeurService;

 @PostMapping("/")
 public int save(@RequestBody Demmandeur demmandeur) {
	return demmandeurService.save(demmandeur);
}
 @GetMapping("/")
public List<Demmandeur> findAll() {
	return demmandeurService.findAll();
}

@GetMapping("/cne/{cne}")
	public Demmandeur findByCne(@PathVariable String cne) {
		return demmandeurService.findByCne(cne);
	}

	@GetMapping("/codeApogee/{codeApogee}")
	public Demmandeur findByCodeApogee(@PathVariable String codeApogee) {
		return demmandeurService.findByCodeApogee(codeApogee);
	}

	@GetMapping("/nom/{nom}")
	public Demmandeur findByNom(@PathVariable String nom) {
		return demmandeurService.findByNom(nom);
	}

	@GetMapping("/cin/{cin}")
	public Demmandeur findByCin(@PathVariable String cin) {
		return demmandeurService.findByCin(cin);
	}

	@GetMapping("/filiere/libelle/{libelle}")
	public List<Demmandeur> findByFiliereLibelle(@PathVariable String libelle){
	return demmandeurService.findByFiliereLibelle(libelle);
	}
	
	@DeleteMapping("/cne/{cne}")
	public int deleteByCne(@PathVariable String cne) {
	return	demmandeurService.deleteByCne(cne);
		
	}

}