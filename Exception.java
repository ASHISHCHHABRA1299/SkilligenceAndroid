package skilligence;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int res = 0;
		try {
			if(b==0)
				throw new ArithmeticException("Cannot divide by zero");
			res=a/b;
			System.out.println(res);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Finally Block");
		}
		

	}	

}
