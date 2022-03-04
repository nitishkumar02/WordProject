package com.cwp.fileType;

import com.cwp.DataProcessor;
import com.cwp.Constants;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.regex.*;
/**
 * @author Nitish
 *
 */

public class TextFile extends DataProcessor
{
	/**
	 * This is program to implement
     * Text file specific algorithm 
	 */

	@Override
	public ArrayList<String> getAllFiles(String[] filesOrDirectName ) 
	{
		/**
		 * Function to Get all Files with .txt extension
		 * @param filesOrDirectName 
		 * @return all .ext files
		 */
		
        Pattern fileExtPattern = Pattern.compile(Constants.fileExtensionRegx);
        /**
         * Regex for .txt files
         */
        
        ArrayList<String> fileList = new ArrayList<String>();
        
        
        if(filesOrDirectName != null)
		{
        	/**
        	 * Iterate for Each file present
        	 */
        	
        	System.out.println("Present Files:");
        	
        	for(String fileName : filesOrDirectName)
			{
        		/**
        		 * Check For Each .txt files
        		 */
				
        		Matcher matchPattern = fileExtPattern.matcher(fileName);
				if(matchPattern.find() && matchPattern.group().equals(fileName))
				{
					/**
					 * check each matched pattern ,
					 * is equal to file name in path
					 */
					
					System.out.println(fileName);
					fileList.add(fileName);
				}
				
		    }
		
	  }
        
        return fileList;
        /**
         * return all valid file with .txt
         */
        
    } 
	/**
	 *  End of Fun getAllFiles()
	 */

	
	
	
	@Override
	public boolean applyBusinessLogic(String filePath,ArrayList<String> fileList) throws Exception 
	{
		
		/**
	    * Function to apply business rules
	    * get/display the result
	    */
		
		boolean flag = false;
		String fileName;
		String fullPath;
		
		if(filePath ==null || fileList==null)
		{
			return flag;
		}
		/**
		 * Return ,in case given path
		 * is empty or list of file is
		 */
		
		
		ListIterator<String> fileIterator= fileList.listIterator(fileList.size());
		
		while(fileIterator.hasPrevious())
		{
			/**
			 * Iterate for each file present
			 */
			
			 fileName =fileIterator.previous();
			/**
			 * get the file name
			 */
			
			
			if(filePath.contains(Constants.linuxMacPath))
				{
				fullPath = filePath+Constants.linuxMacPath+fileName;
				}
			  else
			 {
				fullPath = filePath+Constants.windowsPath+fileName;
			 }
			/**
			 * Form the path for file reader
			 * 
			 */
			    System.out.print("------------------------\n");
				System.out.println("For File:" + fileName);
				System.out.print("------------------------\n");
				
				MoRmWord.printMormWord(fullPath);
				WordLengthFinder.getLength(fullPath);
			  
			  flag = true;
	     }
		/**
		 *  end of while loop, for each file
		 */
		return flag;
}
	/**
	 * end of fun applyBusinessLogic
	 * @return boolean
	 */
	
}
/**
 * end of class TextFile
 */
