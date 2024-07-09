import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int max = 0;
		while(a>0)
		{
			int c = a%10;
			if(c>max)
			{
				max = c;
			}
			a/=10;
		}

	}

}
