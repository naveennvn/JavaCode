package com.general.fileReaders;

import java.io.*;

public class ReadText {

	public static void main(String[] args) throws FileNotFoundException {
		
		//FileInputStream fs=new FileInputStream(".\\Test_Data\\Document.txt");
		FileReader fr=new FileReader("C:\\TestFiles\\Document.txt");
		BufferedReader br = new BufferedReader(fr); 
		String line = null;
		StringBuilder sb = new StringBuilder();
		
		try {
			while((line=br.readLine())!=null)
			{
				sb.append(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		System.out.println("text is "+sb.toString());
		
		for(int i=sb.length()-4;i<sb.length();i++)
		{
			System.out.print(sb.charAt(i));
		}
		
		for(int i=sb.length()-4;i>0;i--)
		{
			System.out.print(sb.charAt(i));
		}
		
	}

}
