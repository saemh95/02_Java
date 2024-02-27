package edu.kh.homework.model.service;

import java.time.LocalDateTime;
import java.util.*;

public interface HomeWorkService {

//	public Map<String, Object> createHw();

	public Map<String, Object> viewHw();

	public String dateFormat(LocalDateTime regDate);

	public int createHw(String title, String detail, int input) throws Exception;

	public boolean updateHw(int index, String title, String detail, int important) throws Exception;

	public String deleteHw(int index) throws Exception;

	public String sortByImportance();

	public String deleteHw() throws Exception;

	public boolean completeHw(int index) throws Exception;
	
}
