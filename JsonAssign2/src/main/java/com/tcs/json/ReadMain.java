package com.tcs.json;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class ReadMain {
	
	public static void main(String[] args) {
		String path = System.getProperty("user.dir")+ "/Emp.json";
		
		try {
			byte[] encoded = Files.readAllBytes(Paths.get(path));
			System.out.println(Arrays.toString(encoded));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
