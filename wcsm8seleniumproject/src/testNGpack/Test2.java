package testNGpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void f() {
	  Reporter.log("f method from test2", false);
  }
  @Test
  public void g()
  {
	  Reporter.log("g method from test1", true);
  }
  @Test
  public void h()
  {
	  int i=10;
	  int j=2;
	  int res=i/j;
	  Reporter.log("h method from test1", true);
  }
 
}
