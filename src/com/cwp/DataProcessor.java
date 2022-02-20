package com.cwp;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
/**
*
* @author Nitish
*/

public abstract class DataProcessor {
	 /**
	* This is a program for implementing the
	* algorithm steps
	*/

	private static  String filePath ;
	private static  String[] filesOrDirectNames;
	private static ArrayList<String> fileList;
	/**
     * Declaring the common used class variables
     * which is of the different data types.
     */
	
	public abstract ArrayList<String> getAllFiles(String[] filesOrDirectNames );
	public abstract boolean applyBusinessLogic(String filePath,ArrayList<String> fileList)throws  Exception ;
	/**
	 * Methods declared which will be implemented
	 * by extending classes 
	 */
	
	public void checkGetApply() throws  Exception 
	{   /**
		 * Method To apply Algorithmic steps 
		 * If Given Directory exists
		 */
		
		checkDirExist();
		/**
		 * First function ,to check Directory Exist or not
		 */
		
		if(!(filesOrDirectNames.length ==0))
		{/**
		 * to Check if returned directory is empty
		 */
			
		fileList=getAllFiles(filesOrDirectNames);
		/**
		 * Second function ,to get all 
		 * files with .txt extension
		 */
		
		
		applyBusinessLogic(filePath ,fileList);
		/**
		 * Third Function to apply
		 * specific requirement
		 */
	
		}
		else
		{
			System.out.println("Directory/Path does Not Contain any files");
			
		}
		
	}
	
	
	
	 
	public void checkDirExist()
	{
		/**
		 * Function to check, if
		 * given Directory  exists
		 * if not,wait till valid path given
		 */
		
		// Get Scanner Object For Standard input e.g. Console
		Scanner scInputObject = new Scanner(System.in);
		/**
		 * Get Scanner Object For Standard input e.g. Console
		 */
		
		boolean flag = true;
		File dirCheck;
		
	while(flag)
	{/**
	* Run till,valid path given
	**/
		
		System.out.println("\nEnter Directory/Path for Given Files");
		filePath = scInputObject.nextLine();
		dirCheck = new File(filePath);
		
		
		if(!dirCheck.exists())
		  {
			/**
			 * Check if Directory/Path Exists
			 */
			
			System.out.println("\nInvalid Directory/Path, please try again");
		    flag = true;	
		  }
		else
		{
		  
	      filesOrDirectNames = dirCheck.list();
	      /**
	       *  get all the files in current directory
	       */
		  
	      flag = false;
		  System.out.println("Valid Directory Exist");
		}
	}
	scInputObject.close();
	
  }
	/**
     *End of Function checkDirExists()
     */

	
	
}
/**
 * End of Class DataProcessor
 */


