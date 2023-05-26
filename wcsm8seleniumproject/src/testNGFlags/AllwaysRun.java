package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AllwaysRun {
  @Test
  public void f() {
	  Reporter.log("hiiiiiiiiiiiiiii",true);
  }
  @Test
  public void g()
  {
	  
	  Reporter.log("Helloooooooo",true);
  }
  @Test
  public void h() {
	  Reporter.log("How are u",true);
  }
}
