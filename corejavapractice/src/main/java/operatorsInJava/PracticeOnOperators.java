package operatorsInJava;

public class PracticeOnOperators {
	int i=22;
	int j=13;

	   
	  public void m1() { i = i++; System.out.println(i+ "  I value for i++"); j =
	  ++j; System.out.println(j+ "   j value for ++j"); }
	 
	
	  public void m2() { i = i--; System.out.println(i+ "  I value for i++"); j =
	  --j; System.out.println(j+ "   j value for ++j");
	  
	  }
	  public void m3() {
		  
		  if(i==12) {
			  System.out.println("i value is  " + i);
			  
			  
		  }
		  if (i != 12) {
			  System.out.println("i value is not " + i );
			  
		  }
		  if(i==12 && j==13) {
			  System.out.println("priniting && Operator");
		  }
		  if(i==12 || j==13) {
			  System.out.println("Printing OR Operator");
		  }
		  
	  }
	  public void MultiDivModuloOperators(){
		  System.out.println(i*j);
		  System.out.println(i/2);
		  System.out.println(i%3);
		  
	  }
	 	
	public static void main(String[] args) {
		PracticeOnOperators pc=new PracticeOnOperators();
		pc.MultiDivModuloOperators();
		
		/*
		 * for(int i=12;i<20;i--) { System.out.println(i++);
		 * System.out.println("Finding i value  "+i); System.out.println(i++);
		 * System.out.println("Finding i value  "+i); System.out.println(i++);
		 * System.out.println("Finding i value  "+i);
		 * 
		 * 
		 * }
		 */
		
		
		//PracticeOnOperators pc=new PracticeOnOperators();
		//pc.m1();
		//pc.m2();
		

	}

}
