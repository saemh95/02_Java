package edu.kh.homework.model.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import edu.kh.homework.model.dao.HomeWorkDAO;
import edu.kh.homework.model.dao.HomeWorkDAOImpl;
import edu.kh.homework.model.dto.HomeWork;
import edu.kh.homework.model.dto.*;

public class HomeWorkServiceImpl implements HomeWorkService{

	private HomeWorkDAO dao = null;
	
	public HomeWorkServiceImpl () throws Exception{
		dao = new HomeWorkDAOImpl();
	}

	@Override
	public Map<String, Object> viewHw() {

		
		List<HomeWork> hw = dao.viewHw();
		int checkedCount = 0;
		
		
		for (HomeWork homework : hw) {
			if (homework.isDone()) {
				checkedCount++;
			}
		}
		Map <String, Object> hwMap = new HashMap<String, Object>();
		
		hwMap.put("hwList", hw);
		hwMap.put("checked", checkedCount);
		
		
		return hwMap;
	}
	
	@Override
	public String dateFormat(LocalDateTime regDate) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		String formattedDateTime = regDate.format(formatter);
		
		return formattedDateTime;
	}

	
}
