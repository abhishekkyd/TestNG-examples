package com.automation.testngexamples.java;

import org.testng.annotations.Test;

public class TestAnnotations1 {

	@Test(priority=2, enabled = true, groups={"sanity123", "demotest"}, timeOut = 5000, dependsOnMethods="method1")
	public void testThisShouldPass() throws InterruptedException {
		Thread.sleep(4000);
	}

	@Test(priority= 1, timeOut = 1000, dependsOnGroups="sanity123")
	public void testThisShouldFail() {
		while (true);
	}
	
	@Test
	public void method1(){
		System.out.println("Test method");
	}

}
