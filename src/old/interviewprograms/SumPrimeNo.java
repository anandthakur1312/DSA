package old.interviewprograms;

public class SumPrimeNo {
	
	 public static void main(String args[]){
         
	       int sum=0;
	       int num = 2;
	       int i = 0;
	       
	       while(i<20){
	    	   if(isPrimeNum(num)){
	    	   
	    	   sum = sum+num;
	    	   
	    	   num++;
	    	   i++;
	    	   }
	    	   
	       }
	       System.out.println(sum);
	    }

	private static boolean isPrimeNum(int num) {
		for(int j=0;j<=1000;j++){
			if(num%2 == 0)
				return false;
			
		}
		return true;
			
	}

}

	
