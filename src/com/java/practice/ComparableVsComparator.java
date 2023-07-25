package com.java.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee implements Comparable<Employee>{
	int id;
	String name;
	int age;
	public Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		return this.age - emp.age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}

class NameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}	
}

class IdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.id>o2.id) return 1;
		if(o1.id<o2.id) return -1;
		else return 0;
	}
	
}
public class ComparableVsComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(2, "Naveen", 29));
		empList.add(new Employee(1, "Vaishnavi", 28));
		Collections.sort(empList);
		empList.forEach(a->System.out.println(a.toString()));
		empList.sort(new NameComparator());
		empList.forEach(a-> System.out.println(a.toString()));
		empList.sort(new IdComparator());
		empList.forEach(a->System.out.println(a.toString()));
	}

}
