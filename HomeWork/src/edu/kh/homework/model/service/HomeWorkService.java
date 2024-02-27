package edu.kh.homework.model.service;

import java.time.LocalDateTime;
import java.util.*;

public interface HomeWorkService {

//	public Map<String, Object> createHw();

	public Map<String, Object> viewHw();

	public String dateFormat(LocalDateTime regDate);

}
