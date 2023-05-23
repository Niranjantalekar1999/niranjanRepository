package testNGpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
  @Test
  public void x() {
	  Reporter.log("x method from test3", false);
  }
  @Test
  public void y()
  {
	  Reporter.log("y method from test1", true);
  }
  @Test
  public void z()
  {
	  Reporter.log("z method from test1", true);
  }
 
}
