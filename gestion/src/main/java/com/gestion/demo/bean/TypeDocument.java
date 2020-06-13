package com.gestion.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TypeDocument {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String libelle ;
	@ManyToOne
	private TypeFiliere typeFilliere;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public TypeFiliere getTypeFilliere() {
		return typeFilliere;
	}
	public void setTypeFilliere(TypeFiliere typeFilliere) {
		this.typeFilliere = typeFilliere;
	}

	public TypeDocument(Long id, String libelle, TypeFiliere typeFilliere) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.typeFilliere = typeFilliere;
	}
	public TypeDocument() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TypeDocument other = (TypeDocument) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
