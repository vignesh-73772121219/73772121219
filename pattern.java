import java.util.Scanner;
public class mains {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		char arr[]= s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			for(int k =1;k<=arr.length-i;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(arr[j]+" ");
				
			}
			
                       System.out.println();

	}
		

}
}