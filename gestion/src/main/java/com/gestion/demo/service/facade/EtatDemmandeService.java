package com.gestion.demo.service.facade;

import java.util.List;

import com.gestion.demo.bean.EtatDemmande;

public interface EtatDemmandeService {

	public int save(EtatDemmande etatdemmande);

	public List<EtatDemmande> findAll();

	public EtatDemmande findByLibelle(String libelle);

	public int deleteByLibelle(String libelle);

}
