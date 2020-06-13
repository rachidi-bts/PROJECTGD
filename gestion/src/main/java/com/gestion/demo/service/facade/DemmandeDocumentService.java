package com.gestion.demo.service.facade;

import java.util.Date;
import java.util.List;

import com.gestion.demo.bean.DemmandeDocument;
import com.gestion.demo.dao.DemmandeDocumentDao;

public interface DemmandeDocumentService {

	public int save(DemmandeDocument demmandedocument);

	public List<DemmandeDocument> findAll();

	public List<DemmandeDocument> findByDemmandeurNom(String nom);

	public List<DemmandeDocument> findByDemmandeurCodeApogee(String codeApogee);

	public List<DemmandeDocument> findByDemmandeurCne(String cne);
	
	public List<DemmandeDocument> findByDemmandeurCin(String cin);

	public List<DemmandeDocument> findByTypeDocumentLibelle(String libelle);

	public List<DemmandeDocument> findByEtatDemmandeLibelle(String libelle);

	public DemmandeDocumentDao findByDateDemmande(Date dateDemmande);
	
}
