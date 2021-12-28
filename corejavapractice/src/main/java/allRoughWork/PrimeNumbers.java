package allRoughWork;

public class PrimeNumbers {
	    
        int n=100;
        
        
        
        public void checkprime() {
        	for(int i=2;i<n-1;i++) {
        		 boolean prime=true;
        	        
        		for (int j=2;j<i;j++) {
        			if(i%j == 0) {
            			prime=false;
            			break;	
            		}
        			
        		}
        		if(prime) {
        		System.out.println(i);}
        		
				/*
				 * if(i%n == 0) { prime=false; break; }
				 * 
				 * else { System.out.println(i); }
				 */
        	}
        	
			/*
			 * if(prime) { System.out.println(n + " is a Prime number"); } else {
			 * 
			 * System.out.println(n + " is not a Prime number"); }
			 */
        	
        	
        }
		  public static void main(String[] args) {
			  System.out.println("All Prime numbers within 100");
			  PrimeNumbers pm = new PrimeNumbers();
			  pm.checkprime();
			  

		  }
		}


