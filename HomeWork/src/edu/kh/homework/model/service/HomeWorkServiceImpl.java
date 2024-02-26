package edu.kh.homework.model.service;

import edu.kh.homework.model.dao.HomeWorkDAO;
import edu.kh.homework.model.dao.HomeWorkDAOImpl;

public class HomeWorkServiceImpl implements HomeWorkService{

	private HomeWorkDAO dao = null;
	
	public HomeWorkServiceImpl () throws Exception{
		dao = new HomeWorkDAOImpl();
	}
	
	
}
