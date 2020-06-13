
package com.gestion.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.demo.bean.TypeDocument;
import com.gestion.demo.bean.TypeFiliere;
import com.gestion.demo.dao.TypeDocumentDao;
import com.gestion.demo.service.facade.TypeFiliereService;
import com.gestion.demo.service.facade.TypeDocumentService;

@Service

public class TypeDocumentServiceImpl implements TypeDocumentService {

	@Autowired

	private TypeDocumentDao typedocumentDao;

	@Override
	public int save(TypeDocument typedocument) {
		TypeDocument foundedTypeDocument = findByLibelle(typedocument.getLibelle());

		if (foundedTypeDocument != null) {
			return -1;
		} else {
			typedocumentDao.save(typedocument);
			return 1;
		}

	}

	@Override
	public List<TypeDocument> findAll() {
		return typedocumentDao.findAll();
	}

	@Override
	public TypeDocument findByLibelle(String libelle) {
		return typedocumentDao.findByLibelle(libelle);
	}

	@Override
	public int deleteByLibelle(String libelle) {
		return typedocumentDao.deleteByLibelle(libelle);
	}

}
