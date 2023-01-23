package tostringinbuiltmethod;

public class Employee {
String name;
int id;
float salary;

public Employee(String name, int id, float salary) {
	this.name =name;
	this.id= id;
	this.salary = salary;
	
}
public String toString()
{
	return name + " " + id + " "+ salary;
}
}
