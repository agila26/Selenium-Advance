package testngg;

import org.testng.annotations.*;

public class Bfrnaftr {
	@AfterTest
	public void b()
	{
		System.out.println("After test");
	}
	@AfterSuite
	public void y()
	{
		System.out.println("After Suite");
	}
	
	
	@BeforeTest
	public void a()
	{
		System.out.println("before test");
	}
	
	@AfterClass
	public void q()
	{
		System.out.println("After class");
	}
	@Test
	public void c()
	{
		System.out.println("@ test 1");
	}
	@Test
	public void e()
	{
		System.out.println("@ test 2");
	}
	
	@BeforeClass
	public void d()
	{
		System.out.println("before class");
	}
	@BeforeSuite
	public void d1()
	{
		System.out.println("before suite");
	}
	
	
		


}
