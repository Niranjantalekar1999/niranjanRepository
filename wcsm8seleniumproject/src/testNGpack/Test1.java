package testNGpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void a() {
	  Reporter.log("a method from test1", true);
  }
  @Test
  public void b()
  {
	  Reporter.log("b method from test1", true);
  }
  @Test
  public void c()
  {
	  Reporter.log("c method from test1", true);
  }
 
}
