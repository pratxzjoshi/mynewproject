package com.thbs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Check {
	
	@Test
	public void testlogin1()
	{
		App myapp=new App();
		Assert.assertEquals(0,myapp.userLogin("abc","abc123"));
	}
	
    @Test
	public void testlogin2()
	{
    	App myapp=new App();
		Assert.assertEquals(1, myapp.userLogin("prateeksha","Prate#2022@"));
	}

}

