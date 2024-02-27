package edu.kh.homework.model.dao;

import java.util.List;

import edu.kh.homework.model.dto.HomeWork;

public interface HomeWorkDAO {

	List<HomeWork> viewHw();

	int createHw(HomeWork hw) throws Exception;

	boolean updateHw(int index, String title, String detail, int important) throws Exception;

	HomeWork deleteHw(int index);

	boolean completeHw(int index) throws Exception;

	
	
}
