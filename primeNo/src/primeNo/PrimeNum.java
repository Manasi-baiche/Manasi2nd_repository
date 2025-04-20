package primeNo;

public class PrimeNum {
	
	 public static void main (String[] args)
	    {	
		 System.out.println("Enter your name:Manasi Baiche");
		 System.out.println("Enter your roll no:3102");
	       int i =0;
	       int num =0;
	       
	       String  prime_numbers = "";

	       for (i = 1; i <= 50; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
	    	  {
	             if(i%num==0)
	    	     {
	     		    counter = counter + 1;
	    	     }
	    	  }
	    	  if (counter ==2)
	    	  {
	    	     prime_numbers = prime_numbers + i + " ";
	    	  }	
	       }	
	       System.out.println("Prime Numbers between 1 and 50 :");
	       System.out.println(prime_numbers);
	    }
	}