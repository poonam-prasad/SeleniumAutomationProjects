package com.Files;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;



public class D01WriteOnFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file=new File("Demo.txt");
		
		FileOutputStream fos=new FileOutputStream(file);
		
		System.out.println("File Created successfully");
	
		FileWriter writer=new FileWriter(file);
		writer.write("JAVA is awesome language");
		writer.close();
	}

}
