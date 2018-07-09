package Freq;

import org.testng.annotations.Test;

public class Testgrp {
	
	@Test(groups={"regression"})
	public void tc_4() {
		System.out.println("regression second testcase");
	}
	
	@Test(groups={"smoke"})
	public void tc_5() {
		System.out.println("smoke third testcase");
	}
	
	@Test(groups={"regression"})
	public void tc_6() {
		System.out.println("regression third testcase");
	}

}
