package skilligence;

//import java.util.Scanner;

//class student1{
//	private String name;
//	private int rollno;
//	
//	student1(){
//		this("raj",1);
////		System.out.println("In Default Constructor");
//		this.displayInfo();
//	}
//	
//	student1(String name,int rollno){
////		this();
//		this.name=name;
//		this.rollno=rollno;
//		
//	}
//
//
//	public String getName() {
//		return this.name;
//	}
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//	public int getRollno() {
//		return rollno;
//	}
//
//
//	public void setRollno(int rollno) {
//		this.rollno = rollno;
//	}
//	
//	public void displayInfo() {
//		System.out.println("Name: "+this.name+"\n"+"RollNo: "+this.rollno);
//	}
//	
//	
//	
//}

//class Person{
//	String name;
//	int age;
//	
//	Person(){
//		System.out.println("In default Constructor");
//	}
//	Person(String name, int age) {
////		this();
//		this.name = name;
//		this.age = age;
//	}
//
//
//	public void displayInfo() {
//		System.out.println("Name: "+this.name+"\n"+"Age: "+this.age);
//	}
//}
//
//class student1 extends Person{
//	int marks;
//	
//	
//	student1(String name, int age, int marks) {
//		super(name,age);
//		this.marks = marks;
//		super.displayInfo();
//		this.displayMarks();
//	}
//
//
//	public void displayMarks() {
//		System.out.println("Marks: "+this.marks);
//	}
//}

//METHOD OVERRIDING

//class Animal{
//	
//	String name;
//	
//	public void eat() {
//		System.out.println("I can eat");
//	}
//	public void displayInfo() {
//		System.out.println("I am a animal");
//	}
//}
//
//class Dog extends Animal{
//	
//	@Override
//	public void displayInfo() {
//		System.out.println("I am a dog");
//	}
//	
//	@Override
//	public void eat() {
//		super.eat();
//		System.out.println("I can eat dog food");
//	}
//	
//	public void display() {
//		System.out.println("My name is: "+name);
//	}
//	
//	
//	public void bark() {
//		System.out.println("I can bark");
//	}
//}


//abstract class Animal{
//	
//	 public abstract void eat(); //function declaration
//	 
//	 //function definition
//	 public void display() {
//		 System.out.println("I am  animal");
//	 }
//
//}
//
//class dog extends Animal{
//
//	@Override
//	public void eat() {
//		
//		
//	}
//	
//}
//
//class cat extends Animal{
//
//	@Override
//	public void eat() {
//		
//	}
//	
//}

class student implements Person1,Person2{

	@Override
	public void name() {
		
	}

	@Override
	public void age() {
		
	}

	@Override
	public void gender() {
		
	}

	@Override
	public void subject() {
		
	}
	
}

public class ClassSeven {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
		
		//FINAL KEYWORD
//		final int a;
//		a=6;
//		System.out.println(a);
		
//		student1 s=new student1();
//		System.out.println(s.getName());
//		System.out.println(s.getRollno());
//		s.setName("rajkumar");
//		System.out.println(s.getName());
//		System.out.println(s.getRollno());
		
//		student1 s=new student1("raj",15,80);

//		s.displayInfo();
//		s.displayMarks();
		
		Dog d=new Dog();
		d.displayInfo();
		d.eat();
		d.name="tuffy";
		d.display();
		d.bark();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//FIRST LOGIC
		
//		System.out.println("Enter two numbers to calculate lcm?");
//		int a = s.nextInt();
//		int b = s.nextInt();
//		int l;
//		if (a > b) {
//			l = a;
//		} else {
//			l = b;
//		}
		// a=4, b=10 l=10
//		while(true) {
//			if(l%a==0&&l%b==0) {
//				System.out.println(l);
//				break;
//			}
//			l++;
//		}
		
		
		//SECOND LOGIC
		//LCM=(a*b)/gcd(a,b)
		
//		int lcm=(a*b)/gcd(a,b);
//		System.out.println(lcm);
		
	}
//	public static int gcd(int a,int b) {
//		int k=b%a;
//		while(k!=0) {
//			a=k;
//			b=a;
//			k=b%a;
//		}
//		return a;
//	}

}
