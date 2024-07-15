import java.util.*;
public class Strimng {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String a[]=s.split(" ");
		for(String s1:a) 
		{
		if(s1.length()%2 == 0) {
			System.out.println("even");
		}
		else {
			System.out.println(s1.length());
		}
	}
	}
}
