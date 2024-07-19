package eniya;
import java.util.*;
public class Alpha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine().toUpperCase();
		for(int i ='A';i<='Z';i++) {
			if(n.contains(Character.toString(i))) {
				System.out.println(Character.toString(i)+" : "+(n.indexOf(i)));
			}
			else {
				System.out.println(Character.toString(i)+ " :-1");
			}
		
		}
	}

}
