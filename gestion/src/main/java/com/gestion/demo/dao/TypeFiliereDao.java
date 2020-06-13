package com.gestion.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.demo.bean.Filiere;
import com.gestion.demo.bean.TypeFiliere;


@Repository
 public interface TypeFiliereDao extends JpaRepository<TypeFiliere,Long> {

	public TypeFiliere findByLibelle(String libelle);

	public int deleteByLibelle(String libelle);
}
