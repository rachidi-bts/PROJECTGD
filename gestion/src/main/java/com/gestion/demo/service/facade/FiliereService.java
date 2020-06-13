package com.gestion.demo.service.facade;

import java.util.List;

import com.gestion.demo.bean.Filiere;

public interface FiliereService {

	public int save(Filiere filiere);

	public List<Filiere> findAll();

	public Filiere findByLibelle(String libelle);

	public int deleteByLibelle(String libelle);

}
