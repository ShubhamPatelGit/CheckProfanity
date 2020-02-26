package com.shu.checkProfanity;

import java.util.ArrayList;
import com.shu.textFileReader.TextFileReader;;

public class CheckProfanity {
	
	public static void main(String[] args) {
		String cm= "C:/comments.txt";	//Path to the comments.txt file
		String pf= "C:/profanity.txt";	//Path to the profanity.txt file
		
		ArrayList <String> comments = new ArrayList<String>();
		ArrayList <String> profanity = new ArrayList<String>();
		TextFileReader reader = new TextFileReader();

		try {
			comments = reader.fileReader(cm);	//All comments must be written in a new line.
			profanity = reader.fileReader(pf);	//All profanity must be written in a new line.
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(String cmt: comments) {
			int count=0;
			for(String pfy: profanity) {
				if((cmt.toLowerCase()).contains(pfy.toLowerCase()))
					count++;
			}
			System.out.println("Comment -> ("+cmt+ ") have "+count+" Profanity");
		}
	}
}