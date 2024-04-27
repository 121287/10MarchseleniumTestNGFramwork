package Demo1;

import org.testng.annotations.Test;

public class PriorityDemo {

	@Test(priority=2)	
	public void method1 () {
		
		System.out.println("Hello");
	}

	@Test(priority=3)
	public void method2 () {
			
			System.out.println("Hello1");
	}

	@Test(priority=1)
	public void method3() {

		System.out.println("Hello2");

	}

}
