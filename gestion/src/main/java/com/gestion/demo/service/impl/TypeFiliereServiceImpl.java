
package com.gestion.demo.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.demo.bean.TypeFiliere;
import com.gestion.demo.dao.TypeFiliereDao;
import com.gestion.demo.service.facade.TypeFiliereService;

@Service

public class TypeFiliereServiceImpl implements TypeFiliereService {

	@Autowired

	private TypeFiliereDao typeFiliereDao;


	@Override
	public List<TypeFiliere> findAll() {
		return typeFiliereDao.findAll();
	}
	@Override
	public int save(TypeFiliere typeFiliere) {
		TypeFiliere foundedTypeFiliere = findByLibelle(typeFiliere.getLibelle());

		if (foundedTypeFiliere != null) {
			return -1;
		} else {
			typeFiliereDao.save(typeFiliere);
			return 1;
		}
	}

	@Override
	public TypeFiliere findByLibelle(String libelle) {
		return typeFiliereDao.findByLibelle(libelle);
	}

	@Override
	public int deleteByLibelle(String libelle) {
		return typeFiliereDao.deleteByLibelle(libelle);
	}
}

