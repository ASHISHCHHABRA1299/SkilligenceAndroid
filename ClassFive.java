package skilligence;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassFive {

	public static void main(String[] args) {
		//SECOND LARGEST ELEMENT
//		int[] arr={5,4,3,2,1,5};
//		int largest=Integer.MIN_VALUE;
//		int slargest=Integer.MIN_VALUE;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>largest) {
//				slargest=largest;
//				largest=arr[i];
//			}else if(arr[i]>slargest&&arr[i]!=largest) {
//				slargest=arr[i];
//			}
//		}
//		System.out.println(largest);
//		System.out.println(slargest);
	
//		ArrayList<Integer> list=new ArrayList<>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(40);
//		list.add(50);
//		System.out.println(list);
//		list.remove(2);
//		System.out.println(list);
//		list.remove(30); // error
//		list.remove(new Integer(30));
//		System.out.println(list);
	
//		for(int i=0;i<list.size();i++)
//			System.out.print(list.get(i)+" ");
		
		//STRING DECLARATION AND STRING POOL 
		
//		String s="apple";
//		String s1=new String("mango");
//		String s2="apple";
//		String s3=new String("apple");
//		System.out.println(s==s2);
//		System.out.println(s==s3);
//		System.out.println(s.equals(s3));
		
		//METHODS OF STRINGS
//		String s="hello";
//		String s1="HELLO";
//		System.out.println(s.charAt(1));
//		System.out.println(s.substring(1, s.length()-1));
//		System.out.println(s.substring(3));
//		System.out.println(s.lastIndexOf('l'));
//		System.out.println(s.concat("buddy"));
//		System.out.println(s.startsWith("he"));
//		System.out.println(s.endsWith("lo"));
//		System.out.println(s==s1);
//		System.out.println(s.equals(s1));
//		System.out.println(s.equalsIgnoreCase(s1));
//		System.out.println(s.length());
//		char[] ch=s.toCharArray();
//		System.out.println(Arrays.toString(ch));
//		System.out.println(s.toUpperCase());
//		System.out.println(s1.toLowerCase());
		
		//STRING BUILDER (MUTABLE STRING)

//		StringBuilder sb=new StringBuilder();
//		
//		sb.append("Hello");
//		sb.append("Buddy");
//		System.out.println(sb);
//		
//		sb.insert(1, "orange");
//		System.out.println(sb);
//		
//		sb.replace(1, 7, "banana");
//		System.out.println(sb);
		
//		sb.delete(1, 5);
//		System.out.println(sb);
		
//		System.out.println(sb.length());
//		
//		System.out.println(sb.reverse());
		
//		System.out.println(sb.substring(1,9));
//		System.out.println(sb.toString().toUpperCase());
		
		String s="racecar";
//		System.out.println(isPalindrome(s));
		
		StringBuilder sb=new StringBuilder(s);
//		System.out.println(sb);
		System.out.println(sb.reverse().equals(sb));
		
		//GCD -Greatest Common Divisor
		
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter the first number?");
//		int a=s.nextInt();
//		System.out.println("Enter the second number?");
//		int b=s.nextInt();
//		int k=b%a;
//		while(k!=0) {
//			a=k;
//			b=a;
//			k=b%a;
//		}
//		System.out.println("GCD is: "+a);
		
	}
	
	public static boolean isPalindrome(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j))
				return false;
			
			i++;
			j--;
		}
		return true;
	}
	
	
}
