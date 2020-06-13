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

import com.gestion.demo.bean.EtatDemmande;
import com.gestion.demo.service.facade.EtatDemmandeService;

@RestController
@RequestMapping("GestionDocument/EtatDemmande")
@CrossOrigin(origins = { "http://localhost:4200" })
public class EtatDemmandeRest {

	@Autowired
	private EtatDemmandeService etatDemmandeService;

	@PostMapping("/")
	public int save(@RequestBody EtatDemmande etatdemmande) {
		return etatDemmandeService.save(etatdemmande);
	}

	@GetMapping("/")
	public List<EtatDemmande> findAll() {
		return etatDemmandeService.findAll();
	}

	@GetMapping("/libelle/{libelle}")
	public EtatDemmande findByLibelle(@PathVariable String libelle) {
		return etatDemmandeService.findByLibelle(libelle);
	}

	@DeleteMapping("/libelle/{libelle}")
	public int deleteByLibelle(@PathVariable String libelle) {
		return etatDemmandeService.deleteByLibelle(libelle);
	}

}