package com.general.fileReaders;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



public class JsonFileReader {

	public static void main(String[] args) throws FileNotFoundException, IOException, org.json.simple.parser.ParseException {
		// parsing file "JSONExample.json" 
        Object obj = new JSONParser().parse(new FileReader(".\\Test_Data\\JsonFile.json")); 
     // typecasting obj to JSONObject 
        JSONObject jo = (JSONObject) obj; 
          
        // getting firstName and lastName 
        String firstName = (String) jo.get("firstName"); 
        String lastName = (String) jo.get("lastName"); 
          
        System.out.println(firstName); 
        System.out.println(lastName); 
          
        // getting age 
        long age = (long) jo.get("age"); 
        System.out.println(age); 
          
        // getting address 
        Map address = ((Map)jo.get("address")); 
     // iterating address Map 
        Iterator<Map.Entry> itr1 = address.entrySet().iterator(); 
        while (itr1.hasNext()) { 
            Map.Entry pair = itr1.next(); 
            System.out.println(pair.getKey() + " : " + pair.getValue()); 
        } 
        JSONArray ja = (JSONArray) jo.get("phoneNumbers"); 
        Iterator itr2=ja.iterator();
        while(itr2.hasNext()) {
        	itr1 = ((Map) itr2.next()).entrySet().iterator(); 
            while (itr1.hasNext()) { 
                Map.Entry pair = itr1.next(); 
                System.out.println(pair.getKey() + " : " + pair.getValue()); 
            } 
        }
	}

}
