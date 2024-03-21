package com.jsp.file_store_hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//we can store pdf .png .txt file  in database

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FileStorage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Lob            //mean large object
	private byte[] file;  //large object ko store krne k lye ham byte data type dengai
	
	
	@Transient
	private String fileName;


	public FileStorage(String fileName) {
		super();
		this.fileName = fileName;
	}
	
	

}
