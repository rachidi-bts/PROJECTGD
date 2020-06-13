package com.gestion.demo.service.facade;

import java.util.List;

import com.gestion.demo.bean.TypeFiliere;

public interface TypeFiliereService {

	public int save(TypeFiliere typeFiliere);

	public List<TypeFiliere> findAll();


	public TypeFiliere findByLibelle(String libelle);

	public int deleteByLibelle(String libelle);
}
