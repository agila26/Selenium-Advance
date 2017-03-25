package testngg;

import org.testng.annotations.*;

public class Priorty {
	@Test(priority=3)
	public void A1()
	{
		System.out.println("bye");
		
	}
	@Test(priority=2)
	public void A2()
	{
		System.out.println("how you?");
		
	}
	@Test(priority=1)
	public void A3()
	{
		System.out.println("hi");
		
	}
	
	

}
