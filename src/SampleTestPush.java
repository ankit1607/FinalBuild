public class SampleTestPush {
	
	SampleTestPush simple;
	
	
	public static void main(String[] args) 
	{
	  System.err.println("Hello!");	
	  System.out.println(SampleTestPush.class);
	  
	  System.out.println("SampleTestPush"); 
	  
	  
	}
	public SampleTestPush(Object sim) {
		this.simple = (SampleTestPush) sim;
	}
}
