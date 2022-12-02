package com.kh.practice.file.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	

	public boolean checkName(String file) {
	return new File(file).isFile();
	//true면 -> file임. 즉 생성되어있음
	//false면 -> 파일이 없음
	
	}

	public void fileSave(String file, String s) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			bw.write(s);
			bw.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}
			
		}

	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			
			String valur = null;
			while((value = br.readLine()) != null) {
				sb.append(value+"\n");
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException)
	}

	}

	public void fileEdit(String file, String s) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))) {
			bw.write(s);
			bw.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}
			

	}
	
