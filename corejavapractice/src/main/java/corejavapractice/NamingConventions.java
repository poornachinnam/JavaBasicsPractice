package corejavapractice;

public class NamingConventions {
	
	public void testMethod() {
		System.out.println("Inside method");
	}

	public static void main(String[] args) {
		NamingConventions NM=new NamingConventions();
		NM.testMethod();
		NamingConventions NM1=new NamingConventions();
		NM1.testMethod();
	}

}
