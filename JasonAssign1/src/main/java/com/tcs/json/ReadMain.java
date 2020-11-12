package com.tcs.json;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadMain {
	public static void main(String [] args) {
		InputStream input=null;
		
		try {
			input = new FileInputStream("ABC.json");
			ObjectMapper mapper = new ObjectMapper();
			user usr = mapper.readValue(input, user.class);
			
			System.out.println(usr);
		}catch(IOException e) {
			e.printStackTrace();
			
		}
	}
}
