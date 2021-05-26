package skilligence;

import java.util.Scanner;

public class ClassThree {

	public static void main(String[] args) {

		// BREAK STATEMENT
//		for(int i=1;i<=10;i++) {
//			if(i==6) 
//				break;
//			System.out.println(i);
//		}

		// Continue Statement
//		for(int i=1;i<=10;i++) {
//			if(i==5)
//				continue;
//			System.out.println(i);
//		}

		// PRIME NUMBER
		Scanner s = new Scanner(System.in);
//		boolean flag = false;
//		System.out.println("Enter the value");
//		int n = s.nextInt();
//		for (int i = 2; i < n; i++) {
//			if (n % i == 0) {
//				flag = true;
//				break;
//			}
//		}
//		if (flag == true)
//			System.out.println("Not Prime");
//		else
//			System.out.println("Prime");
		
//		System.out.println("Enter the number?");
//		int n=s.nextInt();
//		int count=0;
//		for(int i=1;i<=n;i++) {
//			if(n%i==0) {
//				count++;
//			}
//		}
//		if(count==2) {
//			System.out.println("Prime");
//		}else {
//			System.out.println("Not Prime");
//		}
		
		//H/W 2 methods for checking prime number
		
		
		//ARRAYS
		
//		int[] arr=new int[5]; //index from 0 to 4
//		arr[0]=10;
//		arr[1]=20;
//		arr[2]=30;
//		arr[3]=40;
//		arr[4]=50;
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=i;
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		//Another way of declaring array
//		int[] arr1= {10,20,30,40,50};
//		
//		for(int i=0;i<arr1.length;i++) {
//			System.out.println(arr1[i]);
//		}
		
		//Long array
//		long[] arr=new long[5];
		
		
		
//		int[] arr= {10,20,30,40,50,60};
//		int sum=0;
//		for(int i=0;i<arr.length;i++) {
//			sum=sum+arr[i];
//		}
//		System.out.println(sum);
		
		
		//SEACH AN ELEMENT IN AN ARRAY ( LINEAR SEARCH)
//		boolean flag=false;
//		System.out.println("Enter the size of array?");
//		int n=s.nextInt();
//		int[] arr=new int[n];
//		for(int i=0;i<n;i++)
//		{
//			arr[i]=s.nextInt();
//		}
//		System.out.println("Enter the value you want to search?");
//		int m=s.nextInt();
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==m) {
//				flag=true;
//				break;
//			}
//		}
//		if(flag) {
//			System.out.println("It is found");
//		}else {
//			System.out.println("It is not found");
//		}
			
		
		//MAXIMUM AND MINIMUM VALUE
//		int[] arr= {-1,-5,-4,-3,-2};
//		int max=Integer.MIN_VALUE;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max)
//				max=arr[i];
//		}
//		System.out.println(max);
		
//		int min=Integer.MAX_VALUE;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]<min)
//				min=arr[i];
//		}
//		System.out.println(min);
		
		
		//Reverse an array
//		int[] arr= {1,2,3,4,5};
		//5 4 3 2 1
		
//		System.out.println("Before Swapping");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		
//		int a=0;
//		int b=arr.length-1;
//		while(a<b) {
//			int temp=arr[a];
//			arr[a]=arr[b];
//			arr[b]=temp;
//			a++;
//			b--;
//		}
//		
//		System.out.println("After Swapping");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		
		//REVERSE A NUMBER
		
		System.out.println("Enter the number to reverse?");
		int n=s.nextInt();
		int rev=0;
		while(n>0) {
			int temp=n%10;
			rev=rev*10+temp;
			n=n/10;
		}
		System.out.println("Reversed Number is :"+rev);
		
		
		
	}

}
