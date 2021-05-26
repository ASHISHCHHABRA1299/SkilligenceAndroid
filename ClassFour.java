package skilligence;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ClassFour {

	public static void main(String[] args) {
		// SQRT
		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the number to calcuate square root?");
//		int n=s.nextInt();
//		System.out.println("Enter the number of decimal places");
//		int p=s.nextInt();
//		double res=0.0;
//		for(int i=1;i*i<=n;i++) {
//			res=i;
//		}
//		System.out.println("Integer Part: "+(int)res);
//		double inc=0.1;
//		for(int i=1;i<=p;i++) {
//			
//			while(res*res<=n) {
//				res=res+inc;
//			}
//			res=res-inc;
//			inc=inc/10;
//		}
//		
//		System.out.println("Square root of the number is: "+(float)res);

//		System.out.println(res);

		// PRIME NUMBER
//		int flag=0;
//		System.out.println("Enter the number?");
//		int n=s.nextInt();
//		for(int i=2;i*i<=n;i++) {
//			if(n%i==0) {
//				flag=1;
//				break;
//			}
//		}
//		if(flag==1) {
//			System.out.println("Not Prime");
//		}else {
//			System.out.println("Prime");
//		}

//		System.out.println("Enter the number to check whether the number is palindorme?");
//		int n = s.nextInt();
//		boolean ans=palindrome(n);
//		if(ans==true)
//			System.out.println("It is a palindrome");
//		else
//			System.out.println("It is not a palindrome");
		
//		System.out.println("Enter the values of n and r ?");
//		int n=s.nextInt();
//		int r=s.nextInt();
//		int ans=fact(n)/(fact(n-r)*fact(r));
//		System.out.println(ans);

		//RANDOM NUMBER GENERATION
		
		//Dice Program
//		Random r=new Random();
//		System.out.println(r.nextInt(6-1+1)+1);
		//(max-min+1)+1
	
	
		//ARRAYliST
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		list.add(3, 35);
		System.out.println(list);
		System.out.println(list.get(2));
		list.set(5, 45);
		System.out.println(list);
		list.remove(5);
		System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println(list.size());
//		list.clear();
//		System.out.println(list);
		System.out.println(list.contains(50));
		System.out.println(list.indexOf(30));
		list.add(30);
		System.out.println(list.indexOf(30));
		System.out.println(list);
		System.out.println(list.lastIndexOf(30));
		System.out.println(list);
		list.remove(new Integer(30));
		System.out.println(list);
	}

	//factorial funtion
//	public static int fact(int n) {
//		int f=1;
//		for(int i=1;i<=n;i++)
//			f=f*i;
//		return f;
//	}
	
//	public static boolean palindrome(int n) {
//		int t = n;
//		int rev = 0;
//		while (n > 0) {
//			int temp = n % 10;
//			rev = rev * 10 + temp;
//			n = n / 10;
//		}
//		return t==rev;
//	}

	
	
	
	
	
	
	
}
