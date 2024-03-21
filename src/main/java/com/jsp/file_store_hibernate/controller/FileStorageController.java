package com.jsp.file_store_hibernate.controller;

import com.jsp.file_store_hibernate.dao.FileStorageDao;
import com.jsp.file_store_hibernate.dto.FileStorage;

public class FileStorageController {
	
	public static void main(String[] args) {
		
		FileStorage fileStorage=new FileStorage("G:\\image\\resume\\Hannan Resume.pdf"); //we can add file like pdf,txt,jpg  file
		
		FileStorageDao dao=new FileStorageDao();
		
		dao.saveFileStorageDao(fileStorage);
		
		
		
	}

}
