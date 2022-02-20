package com.cwp.fileType;

import com.cwp.DataProcessor;
import com.cwp.Constants;

import java.io.BufferedReader;
import java.io.FileReader;
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
		
		if(filePath ==null || fileList==null)
		{
			return false;
		}
		/**
		 * Return ,in case given path
		 * is empty or list of file is
		 */
		
		ListIterator<String> fileIterator= fileList.listIterator(fileList.size());
		
		ArrayList<String> mOrMwordList = new ArrayList<String>();
		/**
		 * To keep words ,which starts with m or M
		 */
		
		ArrayList<String> wordLongerFiveCharList = new ArrayList<String>();
		/**
		 * To keep words ,which is longer than five words
		 */
		
		
		while(fileIterator.hasPrevious())
		{
			/**
			 * Iterate for each file present
			 */
			
			String fileName =fileIterator.previous();
			/**
			 * get the file name
			 */
			
			String fullPath;
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
			
			    FileReader fileObject;
			    fileObject = new FileReader(fullPath);
				BufferedReader bufferReaderObject = new BufferedReader(fileObject);
				String line =null;
				
				
					while((line = bufferReaderObject.readLine()) != null)
					{  
						/**
						 * Gets each line till end of file is reached 
						 */
					  
					String words[] = line.split(Constants.wordSplitRegx);
					/**
					 * Splits each line of file ,
					 * into words
					 */
					
					 for(String word: words)
					     {
						  Pattern fileExtPattern = Pattern.compile(Constants.wordCheckRegx);
						   Matcher matchPattern = fileExtPattern.matcher(word);
						  
						   if(matchPattern.find() )
						     {
							    mOrMwordList.add(word);
						     }
						   
						    if(word.length()>Constants.wordLength)
						     {
							   wordLongerFiveCharList.add(word);
						     }
					     } // end word [] loop
					 
		          }// end of while loop, for each line
					System.out.println("\nFor File:"+fileName);
					
			print(mOrMwordList,wordLongerFiveCharList);	
			/**
			 * call to display the Requirement
			 */
			
			bufferReaderObject.close();
			return true;
	     }// end of while loop, for each file
		return false;
}
	/**
	 * end of fun applyBusinessLogic
	 * @return boolean
	 */
	
	

private void print(ArrayList<String> mOrMwordList, ArrayList<String> wordLongerFiveCharList)
{
	/**
	 * Function to display Business requirement
	 */
	
	ListIterator<String> wordIterator= mOrMwordList.listIterator(mOrMwordList.size());
	String word = null;
	System.out.print("Words Starts with m or M Characters:");
	while(wordIterator.hasPrevious())
	{
		 word =wordIterator.previous();
		 System.out.print(word +" ");
	}
	System.out.println("\nTotal words Starts with M or m :"+mOrMwordList.size() );
	wordIterator= wordLongerFiveCharList.listIterator(wordLongerFiveCharList.size());
	
	System.out.print("Words Longer than Five Characters:");
	while(wordIterator.hasPrevious())
	{
		 word =wordIterator.previous();
		System.out.print(word+ " ");
	}
	System.out.println();
}
	

}
/**
 * end of class
 */
