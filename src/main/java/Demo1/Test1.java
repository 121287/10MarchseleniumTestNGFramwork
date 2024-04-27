package Demo1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void method1() {

		System.out.println("i am method1 of class Test1");

	}

	@Test
	public void method2() {

		System.out.println("i am method2 of class Test1");
		
	}

	@BeforeSuite
	public void method3() {

		System.out.println("i am method3 of class Test1 BeforeSuite");

	}

	@AfterSuite
	public void method4() {

		System.out.println("i am method3 of class Test1 AfterSuite");

	}
	
	@BeforeClass
	public void method5() {

		System.out.println("i am method5 of class Test1 Beforeclass");

	}
	@AfterClass
	public void method6() {

		System.out.println("i am method6 of class Test1 Afterclass");

	}
	
	@BeforeMethod
	public void method7() {

		System.out.println("i am method7 of class Test1 BeforeMethod");

	}
	
	@AfterMethod
	public void method8() {

		System.out.println("i am method8 of class Test1 AfterMethod");

	}
	
}

