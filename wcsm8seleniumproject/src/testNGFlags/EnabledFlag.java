package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledFlag {
  @Test(enabled =true)
  public void f() {
	  Reporter.log("Login is Perform",true);
  }
 @Test(enabled =false)
 public void g() {
	 Reporter.log("Logout is Perform",true);
 }
}

