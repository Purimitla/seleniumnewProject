package pack;

import org.testng.annotations.Test;

public class Ref {
	
	@Test(groups={"smoke"})
	public void tc_1() {
		System.out.println("smoke first testcase");
	}
	
	@Test(groups={"smoke"})
	public void tc_2() {
		System.out.println("smoke second testcase");
	}
	
	@Test(groups={"regression"})
	public void tc_3() {
		System.out.println("regression first testcase");
	}

}
