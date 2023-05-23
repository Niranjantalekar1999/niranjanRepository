package testNGpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
  @Test
  public void f() {
	  
	 
	  Reporter.log("Hiiii TestNG",true);
  }
  @Test
	  public void g()
	  {
		  Reporter.log("selenium",true);
	  }
  }

