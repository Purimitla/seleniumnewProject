package pack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	
  @Test(enabled=false)
  public void sign() {
	  System.out.println("sign");
  }
  
  @Test(priority=2)
  public void App() {
	  System.out.println("app");
  }
  
//  @Test(dependsOnMethods="sign")
//  public void login() {
//	  System.out.println("login");
//  }
  
  @Test(priority=3)
  public void signup() {
	  System.out.println("signup");
  }
  
  @Test(priority=0)
  public void sin() {
	  System.out.println("sin");
  }
  
  @Test(enabled=false)
  public void signature() {
	  System.out.println("sin");
  }
  
}
