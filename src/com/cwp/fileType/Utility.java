package com.cwp.fileType;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Utility {

	public static void print(ArrayList<String> printStr)
	{
		/**
		 * Function to display Business requirement
		 */
		
		printStr.forEach(word -> System.out.println(word));
		/**
		 * print each word, passing lambda expression as argument
		 */
  }
	
	public static BufferedReader  getFilePath(String filePath) throws Exception
	{
		/**
		 * Function to return fileObject ,formed taking filepath
		 */
		FileReader fileObject = new FileReader(filePath);
		BufferedReader bufferReaderObject = new BufferedReader(fileObject);
		return bufferReaderObject;
	}
	
}
/**
 * End of fun Utility 
 */
