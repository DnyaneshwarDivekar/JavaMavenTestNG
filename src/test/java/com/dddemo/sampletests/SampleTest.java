package com.dddemo.sampletests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dddemo.base.BaseTest;

public class SampleTest extends BaseTest {
	
@Test

public void sampleTest() {
	
	System.out.println("sample test");
	
	Assert.assertTrue(false);
}

}
