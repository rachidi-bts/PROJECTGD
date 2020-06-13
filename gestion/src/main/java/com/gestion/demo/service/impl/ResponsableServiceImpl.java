
package com.gestion.demo.service.impl ;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.demo.bean.Responsable;
import com.gestion.demo.dao.ResponsableDao;
import com.gestion.demo.service.facade.ResponsableService;

 @Service  

 public class ResponsableServiceImpl implements ResponsableService  {


 @Autowired 

 private ResponsableDao responsableDao;

 @Override
	public int save(Responsable responsable) {
	 Responsable foundedResponsable = findByLogin(responsable.getLogin());

		if (foundedResponsable != null) {
			return -1;
		} else {
			responsableDao.save(responsable);
			return 1;
		}
	}

	@Override
	public Responsable findByLogin(String login) {
		return responsableDao.findByLogin(login);
	}

	@Override
	public int deleteByLogin(String login) {
		return responsableDao.deleteByLogin(login);
	}
 @Override 
public List<Responsable>  findAll(){
 return responsableDao.findAll();
}

}
