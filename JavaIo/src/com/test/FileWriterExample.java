package com.test;

import java.io.FileWriter;

public class FileWriterExample {

    public static void main(String args[]){    
        try{    
          FileWriter fw=new FileWriter("C:\\Users\\Admin\\Desktop\\write.txt");    
          fw.write("Welcome to java world!!");    
          fw.close();    
         }catch(Exception e)
        {
        	 System.out.println(e);
        }    
         System.out.println("Success...");    
    }    
}  


