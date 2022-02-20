package com.unitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.cwp.fileType.TextFile;

class GetAllFilesMethodTest {

	@Test
	void test() {
		TextFile testObject = new TextFile();
		ArrayList<String> fileNames =testObject.getAllFiles(null);
		assertEquals(true,fileNames.isEmpty());
	}

}
