package com.automation.testngexamples.listeners;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(com.automation.testngexamples.listeners.Listener)

public class TestListener {

	@Test

	public void main() {

		System.out.println("Execution of Main test is carring on");

	}

	@BeforeMethod

	public void beforeMethod() {

		System.out.println("Execution of Before method is carring on");

	}

	@AfterMethod

	public void afterMethod() {

		System.out.println("Execution of After method is carring on");

	}

}