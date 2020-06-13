
package com.gestion.demo.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.demo.bean.Filiere;
import com.gestion.demo.dao.FiliereDao;
import com.gestion.demo.service.facade.FiliereService;

@Service

public class FiliereServiceImpl implements FiliereService {

	@Autowired

	private FiliereDao filiereDao;

	@Override
	public List<Filiere> findAll() {
		return filiereDao.findAll();
	}
	@Override
	public int save(Filiere filiere) {
		Filiere foundedFiliere = findByLibelle(filiere.getLibelle());

		if (foundedFiliere != null) {
			return -1;
		} else {
			filiereDao.save(filiere);
			return 1;
		}
	}

	@Override
	public Filiere findByLibelle(String libelle) {
		return filiereDao.findByLibelle(libelle);
	}

	@Override
	public int deleteByLibelle(String libelle) {
		return filiereDao.deleteByLibelle(libelle);
	}
}
