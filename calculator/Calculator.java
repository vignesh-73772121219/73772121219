package calculator;

public class multi {
public static void multi(int a,int b) {
	int mul =a*b;
	System.out.println("Multiplication value :"+mul);
}
}




package calculator;
import java.util.*;
public class Add {
	public static void add1(int a,int b) {
		int sum =a+b;
		System.out.println("Addition value :"+sum);
	}

	public static void main(String[] args) {
		 add1(6,8);
	


	}

}




package calculator;
import java.util.*;
public class sub {
	public static void sub(int a,int b) {
		int sub =a-b;
		System.out.println("Subtraction value :"+sub);
		
	}
	public static void main(String []args) {
		sub(9,7);
	}
}



package calculator;
import java.util.*;

public class division {
	public static void div(int a,int b) {
		int div =a-b;
		System.out.println("Division value :"+div);
	}
	public static void main(String[] args) {
		div(8,4);
	}	
}


package calculator;
import calculator.Add;
import calculator.sub;
import calculator.multi;
import calculator.division;
public class calci {
	public static void main(String[] args) {
		Add a = new Add();
		sub s = new sub();
		multi m = new multi();
		division d = new division();	
		a.add1( 4,  6);
		s.sub(8, 9);
		m.multi(6, 5);
		d.div(8, 2);
	}

}
