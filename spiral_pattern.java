public class pattern1 {
	    public static void main(String[] args) {
	        int n = 8;
	      int  k=n/2;
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j <n; j++) {
	            	
	             if(i==0 || i == n-1 || j == 0 || j== n-1){
	            	 System.out.print(k +" ");
	             }
	          
	             else if(i==1 || i == n-2 || j == 1 || j== n-2){
		            	 System.out.print(k-1 +" ");
		             }
	             else  if(i==2 || i == n-3 || j == 2 || j== n-3){
	            	 System.out.print(k-2 +" ");
	             }
	             else if(i==3 || i == n-4 || j == 3 || j== n-4){
	            	 System.out.print(k-3 +" ");
	             
	             }
	             else {
	            	 System.out.print(1+" ");
	             }
	            
	    }
	            System.out.println();
	}
}
}
