package GqtCodes;
import java.util.Scanner;
public class Namesprint {
	public static void main (String [] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the value: ");
	    int n=sc.nextInt();
	    for (int i= 0 ;i<n;i++){
	    	//I    
	  	   for (int j=0;j<n;j++) {
	  			if(j==n/4|| 	   
	  			i==0 && j<n/2||
	  			i==n-1 &&j<n/2
	  			   ) {
	  				System.out.print("@ ");
	  			}
	  			else {System.out.print("  ");
	  			}
	  		}
//	  	   
	  	   for (int j=0;j<n;j++) {
	  		   if (i-j==n/2||
	  			   i+j==(n-1)+(n/2)||
	  			   j==0 && i>=n/4&& i<n/2||
	  			   j==n-1 && i>=n/4&& i<n/2||
	  			   i+j==n/4||
	  			   j-i== 3*n/4||
//	  			   i==j&& i<n/4 && i!=0 ||
//	  			   i+j== n-1 && i<n/4 && i!=0||
	  			   i==0 && j>= n/4&& j<= 3*n/4&& j!= n/2
	  			   || j==n/2 && i<n/4&& i!= 0) {
	  			   System.out.print("˜ ");
	  			}
	  			else {System.out.print("  ");
	  			}
	  		   }
	  	   
	  	   
	  	   
	  	   
	  	   
	 //I	    	   
	  	   for (int j=0;j<n;j++) {
	  			if(j==n/4|| 	   
	  			i==0 && j<n/2||
	  			i==n-1 &&j<n/2
	  			   ) {
	  				System.out.print("@ ");
	  			}
	  			else {System.out.print("  ");
	  			}
	  		}
	 //N	    	   

	  		for  ( int j=0;j<n; j++) {
	  	   		if (j==0|| j==n-1||
	  	   				i==j ){
	  	   			System.out.print("@ ");
	  			}
	  			else {System.out.print("  ");
	  			}
	  	   	}
	  		
	  	// SPACING 
	  		
	  		
	  		
	  		for  ( int j=0;j<n/2; j++) {
	  	   		if (j==0 && i!=0&& i!=n-1||
	  	   			j==n/2 && i!=0&& i!=n-1||
	  	   			i==0 && j<n/2 && j!=0||
	  	   		    i==n-1 && j<n/2 && j!=0) {
	  	   			System.out.print("  ");
	  			}
	  			else {System.out.print("  ");
	  			}
	  	   	
	  	   		}
	 //D
	  		 for (int j=0; j<n; j++)	{
	  			   if (j==0|| 
	  			    		   j==n/2 && i!=0  && i!= (n-1) ||
	  			    		   i==0&& j<n/2||
	  			    		i==n-1&& j<n/2
	  			    		   ) {
	  			    			System.out.print("@ ");
	  			    		}
	  			    		else {System.out.print("  ");
	  			    		}
	  			    	}
	 //I	

	 	    	   for (int j=0;j<n;j++) {
	 	    			if(j==n/4|| 	   
	 	    			i==0 && j<n/2||
	 	    			i==n-1 &&j<n/2
	 	    			   ) {
	 	    				System.out.print("@ ");
	 	    			}
	 	    			else {System.out.print("  ");
	 	    			}
	 	    		}
	  	   
	 //A		    	   
	 	    	   for (int j=0;j<n;j++) {
	 	 	    		if((i==0 && j!=0 &&j<n/2 )||
	 	 	    			(i==n/2 && j<=n/2 )||
	 	 	    			(j==0 && i!=0) ||
	 	 	    			( j==n/2 && i!=0))
	 	 	    		{
	 	 	    		 System.out.print("@ ");
	 	    	
	 	 	    		}
	 	    	
	 	 	    		else {System.out.print("  ");
	 	 	    		}
	 	 	    	}
	 	    	   
	  	   System.out.println();
	 }
	 }
	 }

