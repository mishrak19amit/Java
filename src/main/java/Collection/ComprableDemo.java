package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee implements Comparable<Employee> {
	int age;
	String name;
	double salary;

	public Employee(int age, String name, double salary) {
		this.age = age;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee emp) {
		return this.age - emp.age;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

}

class SortName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return (o1.name.compareToIgnoreCase(o2.name));
	}

}

class SortSalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.salary > o2.salary)
			return 1;
		if (o1.salary < o2.salary)
			return -1;
		else
			return 0;
	}

}

public class ComprableDemo {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(21, "Amit", 56000));
		list.add(new Employee(22, "Aman", 58000));
		list.add(new Employee(20, "Arun", 80000));
		Collections.sort(list);

		System.out.println("Sorted Employee based on their age: ");

		for (Employee emp : list) {
			System.out.println(emp.age + " " + emp.getName() + " " + emp.getSalary());
		}

		SortName sortbyname= new SortName();
		Collections.sort(list, sortbyname);

		System.out.println("Sorted Employee based on their name: ");
		for (Employee emp : list) {
			System.out.println(emp.age + " " + emp.getName() + " " + emp.getSalary());
		}

		SortSalary sortbysalary= new SortSalary();
		Collections.sort(list, sortbysalary);

		System.out.println("Sorted Employee based on their salary: ");
		for (Employee emp : list) {
			System.out.println(emp.age + " " + emp.getName() + " " + emp.getSalary());
		}

	}

}
