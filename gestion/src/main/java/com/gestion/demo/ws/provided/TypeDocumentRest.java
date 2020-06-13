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

import com.gestion.demo.bean.TypeDocument;
import com.gestion.demo.service.facade.TypeDocumentService;

@RestController
@RequestMapping("GestionDocument/TypeDocument")
@CrossOrigin(origins = { "http://localhost:4200" })
public class TypeDocumentRest {

	@Autowired
	private TypeDocumentService typeDocumentService;

	@PostMapping("/")
	public int save(@RequestBody TypeDocument typedocument) {
		return typeDocumentService.save(typedocument);
	}

	public TypeDocument findByLibelle(String libelle) {
		return typeDocumentService.findByLibelle(libelle);
	}

	public int deleteByLibelle(String libelle) {
		return typeDocumentService.deleteByLibelle(libelle);
	}

	@GetMapping("/")
	public List<TypeDocument> findAll() {
		return typeDocumentService.findAll();
	}

}