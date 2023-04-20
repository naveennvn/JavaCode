package com.general.fileReaders;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Readandprint {

	public static String ReadAllContents(String path) throws FileNotFoundException
	{
		FileReader fr=new FileReader(new File(path));
		BufferedReader br=new BufferedReader(fr);
		StringBuilder sb= new StringBuilder();
		String line;
		try {
			while((line=br.readLine())!=null)
			{
				sb.append(line);
			}
			//System.out.println("Appended all text:"+sb.toString());
		} catch (IOException e) {e.printStackTrace();}
		
		return sb.toString();


	}
	
	public static void ReadNReplace(String inputpattern,String input,String toreplace)
	{
		Pattern pattern = Pattern.compile(inputpattern);
        Matcher matcher = pattern.matcher(input);
        int counter=0,pos=0;
        while(matcher.find(pos))
        {
        	  pos = matcher.start() + 1;
            counter++;
        }
        System.out.println(matcher.replaceAll(toreplace));
        System.out.println("from matcher count of words:"+inputpattern+" is: "+counter);
	}
	
	public static void functiontobechecked(String s)
	{
		int count=0,index=0;
		Pattern p=Pattern.compile("Naveen");
		Matcher m=p.matcher(s);
		
		//System.out.println(m.replaceAll("Hello"));
//		while(index<s.length()&&s.indexOf("Naveen")>0)
//		{
//			count=count+1;
//			index=index+6;
//			System.out.println("from while"+count);
//		}
	
	
	}
	
	public static int checkforPattern(String pattern,String input)
	{
		int count=0;
		int lastIndex=0;
		while(lastIndex != -1){

		    lastIndex = input.indexOf(pattern,lastIndex);

		    if(lastIndex != -1){
		        count ++;
		        lastIndex += pattern.length();
		    }
		}
		System.out.println(count);
		return count;
	}
	
	
	public static void main(String[] args) throws IOException {
		
		int counter=checkforPattern("Boss","Big Boss and Boss is back with Big Boss");
		
		String s=ReadAllContents("C:\\TestFiles\\Document.txt");
		ReadNReplace("Boss","Big Boss and Boss is back with Big Boss","King");
		
		
		
	}

}
