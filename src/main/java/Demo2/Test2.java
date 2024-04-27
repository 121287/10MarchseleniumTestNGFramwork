package Demo2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {

	@Test
	public void method1() {

		System.out.println("i am method1 of class Test2");

	}

	@Test
	public void method2() {

		System.out.println("i am method2 of class Test2");
	}

	@BeforeTest
	public void method3() {

		System.out.println("i am method3 of class Test2 BeforeTest");
	}

	@AfterTest
	public void method4() {

		System.out.println("i am method4 of class Test2 AfterTest");
	}

}
