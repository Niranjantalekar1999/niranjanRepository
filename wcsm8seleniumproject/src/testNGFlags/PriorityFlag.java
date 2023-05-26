package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityFlag {
  @Test(priority =2)
  public void f() {
	  Reporter.log("method f",true);
  }
  @Test(priority =1)
  public void a() {
	  Reporter.log("method a",true);
  }
  @Test 
  public void z() {
	  Reporter.log("method z",true);
  }
  @Test
  public void d() {
	  Reporter.log("method d",true);
  }
  @Test
  public void x() {
	  Reporter.log("method x",true);
  }
  @Test(priority =3)
  public void w() {
	  Reporter.log("method w",true);
  }
}
