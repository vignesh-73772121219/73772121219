public class main {
	public static void main(String[] args) {
		int a=5;
		for(int i=0;i<a;i++) {
			for(int j=1;j<=a-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();			
		}
	}
}
