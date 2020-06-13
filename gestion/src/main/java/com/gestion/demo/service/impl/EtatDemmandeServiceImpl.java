
package com.gestion.demo.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.demo.bean.EtatDemmande;
import com.gestion.demo.dao.EtatDemmandeDao;
import com.gestion.demo.service.facade.EtatDemmandeService;

@Service

public class EtatDemmandeServiceImpl implements EtatDemmandeService {

	@Autowired

	private EtatDemmandeDao etatdemmandeDao;

	@Override
	public List<EtatDemmande> findAll() {
		return etatdemmandeDao.findAll();
	}

	@Override
	public int save(EtatDemmande etatdemmande) {
		EtatDemmande foundedEtatDemmande = findByLibelle(etatdemmande.getLibelle());

		if (foundedEtatDemmande != null) {
			return -1;
		} else {
			etatdemmandeDao.save(etatdemmande);
			return 1;
		}
	}

	@Override
	public EtatDemmande findByLibelle(String libelle) {
		return etatdemmandeDao.findByLibelle(libelle);
	}

	@Override
	public int deleteByLibelle(String libelle) {
		return etatdemmandeDao.deleteByLibelle(libelle);
	}
}
