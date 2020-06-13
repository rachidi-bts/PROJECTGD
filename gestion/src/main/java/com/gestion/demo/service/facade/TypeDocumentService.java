package com.gestion.demo.service.facade;

import java.util.List;

import com.gestion.demo.bean.TypeDocument;

public interface TypeDocumentService {

	public int save(TypeDocument typedocument);

	public List<TypeDocument> findAll();


	public TypeDocument findByLibelle(String libelle);

	public int deleteByLibelle(String libelle);
}
