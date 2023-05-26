package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountFlag {
  @Test(invocationCount =10)
  public void f() {
	  
	  Reporter.log("Test Case is Pass",true);
  }
}
