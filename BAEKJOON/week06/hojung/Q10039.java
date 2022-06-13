import java.util.Scanner;

public class Q10039 {
		public static void main(String[] args) {
	 
			Scanner in = new Scanner(System.in);
			
			int sum = 0 ;
			for(int i = 0; i < 5; i++) {
	        
				int val = in.nextInt();
				
				sum += val > 40 ? val : 40;
				
				
				  if(val > 40){
				 	sum += val;
				  } else {
				  	sum += 40;
				  }
				  
				
			}
			System.out.println(sum/5);
		}
	 
	}