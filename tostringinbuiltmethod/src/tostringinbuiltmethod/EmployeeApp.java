package tostringinbuiltmethod;

public class EmployeeApp {
public static void main(String[] args) {
	Employee e1 = new Employee("Rohit", 12, 4000.0F);
	System.out.println(e1.toString());
	Employee e2 = new Employee("Sachin", 18, 45000.50F);
	System.out.println(e2.toString());
	String s1 = "Kodnest";
	System.out.println(s1.toString());
}
}
