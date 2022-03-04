package com.cwp.fileType;

import java.io.BufferedReader;
import java.util.ArrayList;


import com.cwp.Constants;

public class WordLengthFinder {
	
	public static void getLength(String filePath) throws Exception
	{

		BufferedReader bufferReaderObject = Utility.getFilePath(filePath);
		String line =null;
		
		ArrayList<String> wordLongerFiveCharList = new ArrayList<String>();
		/**
		 * To keep words ,which starts with m or M
		 */
		
		while((line = bufferReaderObject.readLine()) != null)
		{  
			/**
			 * Gets each line ,till end of file is reached 
			 */
		  
		String words[] = line.split(Constants.wordSplitRegx);
		/**
		 * Splits each line of file ,
		 * into words
		 */
		
		 for(String word: words)
		     {
			    
			 if(word.length()>Constants.wordLength)
			     {
				   wordLongerFiveCharList.add(word);
			     }
			    
		     } 
		     /**
		      * end word loop,for each word
              */		 
      }
		/**
         * end of while loop, for each line
         * */
		
		bufferReaderObject .close();
		System.out.print("Words Longer than Five Characters:");
		Utility.print(wordLongerFiveCharList);
		
	}
	/**
	 * End of function
	 */

}
