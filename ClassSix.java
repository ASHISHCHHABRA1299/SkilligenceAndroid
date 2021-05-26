package skilligence;

//class bulb {
//	// data members
//	boolean isOn;
//
//	//methods
//	public void turnOn() {
//		System.out.println("Turning On the bulb");
//		isOn=true;
//	}
//	public void turnOff() {
//		System.out.println("Turning Off the bulb");
//		isOn=false;
//	}
//}

//class calculator {
//	int a;
//	int b;
//
//	public void sum() {
//		System.out.println("Sum is: " + (a + b));
//	}
//
//	public void subtract() {
//		System.out.println("Subtraction is: " + (a - b));
//	}
//
//	public void multiply() {
//		System.out.println("Multiply is: " + a * b);
//	}
//
//	public void division() {
//		System.out.println("Division is:" + a / b);
//	}
//}

//class calculator{
//	
//	public int sum(int a,int b) {
//		return (a+b);
//	}
//	public int subtract(int a,int b) {
//		return (a-b);
//	}
//}


//class Student{
//	String name;
//	int rollno;
//	static int no_of_students;
//	
//	Student(){
//		System.out.println("In default constructor");
//	}
//	Student(String n,int r){
//		name=n;
//		rollno=r;
//		no_of_students++;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public int getRoll() {
//		return rollno;
//	}
//	
//	public static int getnoofstudents() {
//		return no_of_students;
//	}
//	
//}


//METHOD OVERLOADING
//class addition{
//	
//	
//	public void sum(int a,int b) {
//		System.out.println("Sum is: "+(a+b));
//	}
//	public void sum(int a,int b,int c) {
//		System.out.println("Sum is: "+(a+b+c));
//	}
//	public void sum(int a,int b,int c,int d) {
//		System.out.println("Sum is: "+(a+b+c+d));
//	}
//	public void sum(float a,float b) {
//		System.out.println("Sum is: "+(a+b));
//	}
//	
//	public void sum(int ... ar) {
//		int sum=0;
//		for(int a:ar) {
//			sum=sum+a;
//		}
//		System.out.println("Sum is: "+sum);
//	}
	
//}

class student{
	//data abstraction
	private String name;
	private int rollno;
	
	student(String n,int r){
		name=n;
		rollno=r;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int r) {
		rollno = r;
	}
	
}




public class ClassSix {

	public static void main(String[] args) {
//		bulb b=new bulb();
//		b.turnOn();
//		System.out.println(b.isOn);
//		b.turnOff();
//		System.out.println(b.isOn);
		
//		calculator c=new calculator();
//		c.a=5;
//		c.b=5;
//		c.sum();
//		c.subtract();
//		c.multiply();
//		c.division();
//		calculator c=new calculator();
//		System.out.println(c.sum(3, 4));
//		System.out.println(c.subtract(4, 3));
		
//		System.out.println(Student.getnoofstudents());
//		Student s=new Student("raj",1);
//		Student s1=new Student("rajeev",2);
//		Student s2=new Student("rajveer",3);
		
//		System.out.println(s.getName());
//		System.out.println(s.getRoll());
//		System.out.println(Student.getnoofstudents());
		
//		addition a=new addition();
//		a.sum(1, 2);
//		a.sum(1, 2,3);
//		a.sum(1, 2, 3, 4);
//		a.sum(1.2f, 2.3f);
		student s=new student("raj",1);
		System.out.println(s.getName());
		System.out.println(s.getRollno());
		s.setName("ashish");
		s.setRollno(2);
		System.out.println(s.getName());
		System.out.println(s.getRollno());
	}

}
