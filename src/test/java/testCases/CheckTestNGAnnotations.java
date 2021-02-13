package testCases;

import org.testng.annotations.*;

public class CheckTestNGAnnotations {
	/*
	@BeforeSuite
	@AfterSuite
	@BeforeClass
	@AfterClass
	@BeforeTest
	@AfterTest
	@BeforeGroups
	@AfterGroups
	@BeforeMethod
	@AfterMethod
	@DataProvider
	@Factory
	@Listeners
	@Parameters
	@Test
	*/
	@BeforeSuite
	public void BeforeSuite() {System.out.println("BeforeSuite");}
	@AfterSuite
	public void AfterSuite() {System.out.println("AfterSuite");}
	@BeforeClass
	public void BeforeClass() {System.out.println("BeforeClass");}
	@AfterClass
	public void AfterClass() {System.out.println("AfterClass");}
	@BeforeTest
	public void BeforeTest() {System.out.println("BeforeTest");}
	@AfterTest
	public void AfterTest() {System.out.println("AfterTest");}
	@BeforeGroups
	public void BeforeGroups() {System.out.println("BeforeGroups");}
	@AfterGroups
	public void AfterGroups() {System.out.println("AfterGroups");}
	@BeforeMethod
	public void BeforeMethod() {System.out.println("BeforeMethod");}
	@AfterMethod
	public void AfterMethod() {System.out.println("AfterMethod");}
	@Test
	public void Test() {System.out.println("Test");}


	
}
