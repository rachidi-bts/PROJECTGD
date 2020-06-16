
package com.gestion.demo.service.impl;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.demo.bean.Demmandeur;
import com.gestion.demo.dao.DemmandeurDao;
import com.gestion.demo.service.facade.DemmandeurService;


@Service

public class DemmandeurServiceImpl implements DemmandeurService {

	@Autowired

	private DemmandeurDao demmandeurDao;

	@Override
	public int save(Demmandeur demmandeur) {

		Demmandeur foundedDemmandeur = findByNom(demmandeur.getNom());

		if (foundedDemmandeur != null) {
			return -1;
		} else {
			demmandeurDao.save(demmandeur);
			return 1;
		}
	}

	@Override
	public List<Demmandeur> findAll() {
		return demmandeurDao.findAll();
	}

	@Override
	public Demmandeur findByCne(String cne) {
		return demmandeurDao.findByCne(cne);
	}

	@Override
	public Demmandeur findByCodeApogee(String codeApogee) {
		return demmandeurDao.findByCodeApogee(codeApogee);
	}

	@Override
	public Demmandeur findByNom(String nom) {
		return demmandeurDao.findByNom(nom);
	}

	@Override
	public Demmandeur findByCin(String cin) {
		return demmandeurDao.findByCin(cin);
	}

	@Override
	public List<Demmandeur> findByTypeFiliereLibelle(String libelle) {
		return demmandeurDao.findByTypeFiliereLibelle(libelle);
	}


	@Override
	public int deleteByCne(String cne) {
		return demmandeurDao.deleteByCne(cne);
	}

}
