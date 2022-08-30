package equal_implementation;

public class Application extends Employee{
	public static void main(String[] args) {
		
		Object emp1 = new Object();
		Object emp2 = new Object();
		Object emp3 = new Object();
		
		System.out.println(emp1.equals(emp2));
		System.out.println(emp2.equals(emp3));
		System.out.println(emp1.equals(emp3));
		
	}
}
