package com.unitTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.cwp.fileType.TextFile;

class ApplyBusinessLogicMethodTest {

	@Test
	void test() throws Exception {
		TextFile testObject = new TextFile();
		 boolean checkExecute = testObject.applyBusinessLogic(null, null);
		 assertEquals(false,checkExecute);
	}

}
