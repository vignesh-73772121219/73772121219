public class Index {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n =sc.nextInt();
		int a[]=new int[n];
		int count=0;
		for(int i =0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
		if(i%2 == 0 ) {
			
			count+=a[i];
		}
		else {
		}
		}
		System.out.println(count);
	}

}
