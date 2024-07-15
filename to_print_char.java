import java.util.*;
public class n_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char arr[] = s.toCharArray();
		for(int i =0;i<arr.length;i++) {
			if(arr[i] !=' ' && (i == 0 || arr[i-1] ==' ')) {
				System.out.println(arr[i]);
			}
		}
	}

}
