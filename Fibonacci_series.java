import java.util.*;
import java.util.Scanner;
public class Solutipo {
	public static void funct(int n1 ,int n2) {
		int n=10;
		
		for(int i =0;i<n;++i) {
			int n3=n2+n1;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}
	public static void main(String []args) {
		int n1=0;
		int n2=1;
		System.out.println(n1+"\n"+n2);
		funct(n1,n2);
	}

}
