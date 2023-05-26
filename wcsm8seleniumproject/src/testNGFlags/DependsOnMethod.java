package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod {
  @Test
  public void m1() {
	  Reporter.log("login is Perform",true);
	  
  }
  @Test(dependsOnMethods ="g")
  public void m2() {
	  Reporter.log("logout perform",true);
  }
  @Test(dependsOnMethods = "m1")
  public void g() {
	  Reporter.log("created User ",true);
  }
  
  
}
