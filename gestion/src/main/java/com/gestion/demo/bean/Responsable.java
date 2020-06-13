package com.gestion.demo.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Responsable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String login;
	private String password;
	@ManyToOne
	private TypeFiliere typeFilliere;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public TypeFiliere getTypeFilliere() {
		return typeFilliere;
	}
	public void setTypeFilliere(TypeFiliere typeFilliere) {
		this.typeFilliere = typeFilliere;
	}
	
	public Responsable(Long id, String login, String password, TypeFiliere typeFilliere) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.typeFilliere = typeFilliere;
	}
	public Responsable() {
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
		Responsable other = (Responsable) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
