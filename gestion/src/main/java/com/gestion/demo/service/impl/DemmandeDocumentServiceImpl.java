
package com.gestion.demo.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.demo.bean.DemmandeDocument;
import com.gestion.demo.dao.DemmandeDocumentDao;
import com.gestion.demo.service.facade.DemmandeDocumentService;

@Service

public class DemmandeDocumentServiceImpl implements DemmandeDocumentService {

	@Autowired

	private DemmandeDocumentDao demmandedocumentDao;

	@Override
	public int save(DemmandeDocument demmandedocument) {
		List<DemmandeDocument> foundedDemmandeDocument = findByDemmandeurNom(demmandedocument.getDemmandeur().getNom());

		if (foundedDemmandeDocument != null) {
			return -1;
		} else {
			demmandedocumentDao.save(demmandedocument);
			return 1;
		}
	}

	@Override
	public List<DemmandeDocument> findAll() {
		return demmandedocumentDao.findAll();
	}

	@Override
	public List<DemmandeDocument> findByDemmandeurNom(String nom) {
		return demmandedocumentDao.findByDemmandeurNom(nom);
	}

	@Override
	public List<DemmandeDocument> findByDemmandeurCodeApogee(String codeApogee) {
		return demmandedocumentDao.findByDemmandeurCodeApogee(codeApogee);
	}

	@Override
	public List<DemmandeDocument> findByDemmandeurCne(String cne) {
		return demmandedocumentDao.findByDemmandeurCne(cne);
	}

	@Override
	public List<DemmandeDocument> findByDemmandeurCin(String cin) {
		return demmandedocumentDao.findByDemmandeurCin(cin);
	}

	@Override
	public List<DemmandeDocument> findByTypeDocumentLibelle(String libelle) {
		return demmandedocumentDao.findByTypeDocumentLibelle(libelle);
	}

	@Override
	public List<DemmandeDocument> findByEtatDemmandeLibelle(String libelle) {
		return demmandedocumentDao.findByEtatDemmandeLibelle(libelle);
	}

	@Override
	public DemmandeDocumentDao findByDateDemmande(Date dateDemmande) {
		return demmandedocumentDao.findByDateDemmande(dateDemmande);
	}

	
	}


