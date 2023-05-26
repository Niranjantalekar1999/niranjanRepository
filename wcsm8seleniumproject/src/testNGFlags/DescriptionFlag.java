package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DescriptionFlag {
  @Test(description = "Perform Login")
  public void m1() {
	  Reporter.log("M1 is login!!!", true);
  }
}
