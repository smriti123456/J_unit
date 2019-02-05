package junit.a;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.*;

import java.util.ArrayList;

public class test_consec {
	

	consec obj = new consec();

	@Test
	public void testConsecutiveString()
	{
		

	ArrayList<String> actualString = new ArrayList<String>();
	ArrayList<String> expectedString = new ArrayList<String>();

	actualString.add("smriti");
	actualString .add("raahert");
	actualString .add("bbdfer");

	expectedString.add("raahert");
	expectedString.add("bbdfer");

	ArrayList<String> actualConsecutiveLetterResult = obj.findConsecString(actualString);
	System.out.println("method executed");
	AssertJUnit.assertEquals(expectedString, actualConsecutiveLetterResult);

	}
	}
