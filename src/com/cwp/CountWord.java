package com.cwp;

import com.cwp.fileType.TextFile;

/**
*
* @author Nitish
*/

public class CountWord{
	/**
	* This is a program for counting word from .txt files  in java.
	*
	*/

	public static void main(String[] args) throws Exception
	{
		/**
	        * This is the main method
	        * which is very important for
	        * execution for a java program.
	        * @throws Exception
	        */
		
		DataProcessor dpObject = new TextFile();
		/**
	        * Declared Reference variable
	        * Of Super class which holds
	        * object of IMplementation class TextFile
	        *
	        */
		
		
		dpObject.checkGetApply();
		/**
	        * Calling the method, 
	        * to execute the algorithm steps
	        */
	}
}
