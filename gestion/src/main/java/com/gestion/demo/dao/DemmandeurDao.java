package com.gestion.demo.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.demo.bean.Demmandeur;
import com.gestion.demo.bean.Filiere;
import com.gestion.demo.bean.TypeFiliere;


@Repository
 public interface DemmandeurDao extends JpaRepository<Demmandeur,Long> {


	 public Demmandeur findByTypeFiliere(TypeFiliere typeFiliere);

	 public int deleteByTypeFiliere(TypeFiliere typeFiliere);
	 
	 public Demmandeur findByCne(String cne);
		
	 public Demmandeur findByCodeApogee(String codeApogee);
		
	 public Demmandeur findByNom(String nom);
		
	 public Demmandeur findByCin(String cin);
	 
	 public List<Demmandeur> findByTypeFiliereLibelle(String libelle);

	 public int deleteByCne(String cne);			

}
		