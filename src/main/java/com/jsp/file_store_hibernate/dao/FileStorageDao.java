package com.jsp.file_store_hibernate.dao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.file_store_hibernate.dto.FileStorage;

public class FileStorageDao {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Hannan");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public FileStorage saveFileStorageDao(FileStorage fileStorage) {
		
		
		Path path=Path.of(fileStorage.getFileName());    //file ko read krne ke lye Path interface use krna hai [remember it]
	
		try {
			byte [] file=Files.readAllBytes(path);
			fileStorage.setFile(file);
			et.begin();
			em.persist(fileStorage);
			et.commit();
			return fileStorage;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	
	}

}
