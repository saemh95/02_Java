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

	@Override
	public int createHw(String title, String detail, int input) throws Exception{
		
		HomeWork hw = new HomeWork(title, false, LocalDateTime.now(), detail, input);
		int index = dao.createHw(hw);
		return index;
		
	}
	@Override
	public boolean updateHw(int index, String title, String detail, int important) throws Exception{
		return dao.updateHw(index, title, detail, important);
	}
	@Override
	public String deleteHw(int index) throws Exception{
		
		HomeWork delete = dao.deleteHw(index);
		if (delete == null) return null;
		
		
		
		return delete.getTitle();
	}
	@Override
	public String deleteHw() throws Exception{
		List <HomeWork> hw = dao.viewHw();
		StringBuilder sb = new StringBuilder();
		int count = -1;
		for (HomeWork homework : hw) {
			count ++;
			String title = homework.getTitle();
			String completed = homework.isDone() ? "Y" : "N";
			String detail = homework.getDetail();
			int imp = homework.getImportant();
			String date = dateFormat(homework.getRegDate());
			
			String result = "[ " + count + " No ]" + "Title : " + title + " / Done : " + completed + " / Detail : " + detail + " / Important : " + imp + " / Created Date : " + date;
			sb.append(result + "\n");
		}
		return sb.toString();
	}

	@Override
	public String sortByImportance() {
		List<HomeWork> hw = dao.viewHw();
//		Map<String, Object> hwMap = new HashMap<String, Object>();
		
		Comparator<HomeWork> importance = Comparator.comparing(HomeWork::getImportant);
		String sortByImp = "";
		int count = 0;
		Collections.sort(hw, importance);
		for (HomeWork homework : hw) {
			count++;
			sortByImp += "[" + count + "] Title : " + homework.getTitle() + " / Importance : " + homework.getImportant() + " / Status : " + homework.isDone() + " / Detail : " + homework.getDetail() + " / Registered Date : " + homework.getRegDate() + "\n";
		}
//		hwMap.put("importance", hwMap);
//		hwMap.put(null, hwMap);
		return sortByImp;
	}

	@Override
	public boolean completeHw(int index) throws Exception{

		return dao.completeHw(index);
	}
	
	
}
