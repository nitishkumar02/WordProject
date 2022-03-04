package com.cwp.fileType;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cwp.Constants;

public class MoRmWord {

	public static void printMormWord(String filePath) throws Exception
	{
		/**
		 * Function to return word starting with M or m
		 */
		
		BufferedReader bufferReaderObject = Utility.getFilePath(filePath);
		/**
		 * Function to get filePath object
		 */
		
		String line =null;
		
		ArrayList<String> mOrMwordList = new ArrayList<String>();
		/**
		 * To keep words ,which starts with m or M
		 */
		
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
			  
		     } 
		 /**
		  *  end word loop
		  */
		 
      }
		/**
		 *  end of while loop, for each line
		 */
		
		bufferReaderObject.close();
		System.out.print("Words Starts with m or M Characters:");
		Utility.print(mOrMwordList);
		System.out.println("\nTotal words Starts with M or m :"+mOrMwordList.size() );
             /**
              * call to display the Requirement
              */
		
	}
}
/**
 *  End of function
 */
