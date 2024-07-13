public class String1 {

	public static void main(String[] args) {
		String s = "gh17jd9j";
		char arr[] = s.toCharArray();
		int sum=0;
		for(int i = 0;i<arr.length;i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9'){
				int a=s.charAt(i);
				int b=Character.getNumericValue(a);
				sum+=b;
			
			}
			else {
				System.out.println(s.charAt(i));
			}
			
		}
		System.out.println(sum);
	}

}
