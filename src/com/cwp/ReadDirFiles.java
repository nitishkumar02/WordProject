package com.cwp;

import java.util.Scanner;
import java.io.*;
import com.cwp.Constants;
import java.util.regex.*;
public class ReadDirFiles {
/*
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		String filePath =null;
		File dirCheck;
		String[] filesOrDirectName = null;
		
		while(flag)
		{
		System.out.println("Enter Directory/Path for Given Files");
		filePath = sc.nextLine();
		dirCheck = new File(filePath);
		// Check if Directory/Path Exists
		if(!dirCheck.exists())
		  {
		  flag = true;	
		  }
		else
		{
		        // get all the files in current directory
				 filesOrDirectName = dirCheck.list();
				 flag = false;
				 //System.out.println("heyfalse");
		}

	    } //end while loop
		//System.out.print("123");
		//path exists, check for all .txt files present
		Pattern fileExtPattern = Pattern.compile(Constants.fileExtensionRegx);
		if(filesOrDirectName != null)
		{
			//System.out.print("hey456");
			for(String fileName : filesOrDirectName)
			{
				//System.out.println("inside");
				Matcher matchPattern = fileExtPattern.matcher(fileName);
				if(matchPattern.find() && matchPattern.group().equals(fileName))
				{
					System.out.println("\nfilename:"+fileName);
					// Read the file
					   String s1 = filePath.concat("/").concat(fileName);
					   System.out.println(s1);
					  FileReader file = new FileReader(s1);
					  BufferedReader br = new BufferedReader(file);
					  //Gets each line till end of file is reached  
					  String line =null;
					  int count = 0;
				        while((line = br.readLine()) != null)
				            {  
				            //Splits each line into words  
				            String words[] = line.split(Constants.wordSplitRegx);
				            //System.out.println(words[]);
				             for(String word: words)
				                 {
				            	 fileExtPattern = Pattern.compile(Constants.wordCheckRegx);
				            	  matchPattern = fileExtPattern.matcher(word);
				            	   if(matchPattern.find() && matchPattern.group().equals(word))
				            	  {
				            		  //System.out.println(word);
				            		  count++;
				            	  }
				            	   if(word.length()>Constants.wordLength)
				            	   {
				            		   System.out.println(word);
				            	   }
				            	   
				            	 //System.out.println(word);
				                 } // end word [] loop
					  
					
				             } //end of file reached
				        System.out.println("No Of Words Starts with M or m:"+count);
			} // end of Filename found loop
			
		} // for each file present
		
		
		
	}
		else
		{
			System.out.println("Empty Directory");
		}
}
*/
	
}
