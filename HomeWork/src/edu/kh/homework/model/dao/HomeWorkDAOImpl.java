package edu.kh.homework.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import edu.kh.homework.model.dto.HomeWork;

public class HomeWorkDAOImpl implements HomeWorkDAO{

	private final String FILE_PATH = "/io_test/HomeWork.dat";
	
	
	private ObjectInputStream ois = null;
	private ObjectOutputStream oos = null;
	
	private List<HomeWork> hw = null;
	
	public HomeWorkDAOImpl() throws FileNotFoundException, IOException, ClassNotFoundException{
				
		File file = new File(FILE_PATH);
		
		if (file.exists()) {
			
			try {
				

				ois = new ObjectInputStream(new FileInputStream(FILE_PATH));

				hw = (ArrayList<HomeWork>)ois.readObject();
				
			} finally {
				if( ois != null) ois.close();
			}
		} else {

			File directory = new File("/io_test");
			if(!directory.exists())directory.mkdir();
			

			hw = new ArrayList<HomeWork>();
			
			hw.add( new HomeWork("Make new Homework", false, LocalDateTime.now(), "MVC style programming", 5));
			hw.add( new HomeWork("Eat food", false, LocalDateTime.now(), "Get McDonalds", 1));
			hw.add( new HomeWork("Programming project", false, LocalDateTime.now(), "I dunno what to do actually", 3));
			
			try {				
				oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
				oos.writeObject(hw); 
				
			} finally {
				if(oos != null)oos.close();
			}
			System.out.println("***HomeWork.dat 파일 생성 완료***");

		}
		
	}

	
}
