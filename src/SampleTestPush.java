import java.awt.Robot;
import java.awt.event.KeyEvent;

public class SampleTestPush {
	
	SampleTestPush simple;
	
	
	public static void main(String[] args) 
	{
	  System.err.println("Hello!");	
	  System.out.println(SampleTestPush.class);
	  
	  System.out.println("SampleTestPush"); 
	  
	  try
	  {
		  
		  System.out.println("Click anywhere on the screen(Where you can type. like Notepad , workspace) .... ");
		  
		  Thread.sleep(6000);
		  
		  Robot rb = new Robot();
		  rb.keyPress(KeyEvent.VK_T);
		  rb.keyRelease(KeyEvent.VK_T);		  
		  rb.keyPress(KeyEvent.VK_H);
		  rb.keyRelease(KeyEvent.VK_H);
		  rb.keyPress(KeyEvent.VK_A);
		  rb.keyRelease(KeyEvent.VK_A);
		  rb.keyPress(KeyEvent.VK_N);
		  rb.keyRelease(KeyEvent.VK_N);
		  rb.keyPress(KeyEvent.VK_K);
		  rb.keyRelease(KeyEvent.VK_K);
		  
		  
		  rb.keyPress(KeyEvent.VK_SPACE);
		  rb.keyRelease(KeyEvent.VK_SPACE);
		 
		  rb.keyPress(KeyEvent.VK_Y);
		  rb.keyRelease(KeyEvent.VK_Y);
		  rb.keyPress(KeyEvent.VK_O);
		  rb.keyRelease(KeyEvent.VK_O);
		  rb.keyPress(KeyEvent.VK_U);
		  rb.keyRelease(KeyEvent.VK_U);
		  
		  rb.keyPress(KeyEvent.VK_SPACE);
		  rb.keyRelease(KeyEvent.VK_SPACE);
		  
		  rb.keyPress(KeyEvent.VK_S);
		  rb.keyRelease(KeyEvent.VK_S);
		  rb.keyPress(KeyEvent.VK_I);
		  rb.keyRelease(KeyEvent.VK_I);
		  rb.keyPress(KeyEvent.VK_R);
		  rb.keyRelease(KeyEvent.VK_R);
	  }
	  catch(Exception e)
	  {
		  System.err.println(e);
	  }
	}
	public SampleTestPush(Object sim) {
		this.simple = (SampleTestPush) sim;
	}
}
