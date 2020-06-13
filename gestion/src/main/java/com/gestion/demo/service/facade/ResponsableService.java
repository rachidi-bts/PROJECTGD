package com.gestion.demo.service.facade;

import java.util.List;

import com.gestion.demo.bean.Responsable;

public interface ResponsableService {

	public int save(Responsable responsable);

	public List<Responsable> findAll();

	public Responsable findByLogin(String login);

	public int deleteByLogin(String login);
}
