package com.shu.textFileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class TextFileReader {
	
	public ArrayList<String> fileReader(String str) throws Exception {	//Reads text Files and stores in ArrayList
		BufferedReader bf = new BufferedReader(new FileReader(str));
		ArrayList<String> list = new ArrayList<String>();
		String line = bf.readLine();
		
		while(line != null) {
			list.add(line);
			line = bf.readLine();
		}
		bf.close();
		return list;
	}
}
