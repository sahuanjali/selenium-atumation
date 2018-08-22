package testng;

import org.testng.annotations.Test;

public class maventest {
  @Test
  public void print() throws InterruptedException {
	  
	  for(int index=0;index<10;index++)
	  {	  
	  System.out.println("print");
	  Thread.sleep(1000);
	  }
	  
  }
}
