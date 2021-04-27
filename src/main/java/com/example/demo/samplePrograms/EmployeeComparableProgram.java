package com.example.demo.samplePrograms;


public class EmployeeComparableProgram implements Comparable<EmployeeComparableProgram>{

	
	private int id;
	private String name;
	private int age;
	private long salary;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public EmployeeComparableProgram(int id, String name, int age, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public EmployeeComparableProgram() {
		super();
		// TODO Auto-generated constructor stub
	}
@Override
	public int compareTo(EmployeeComparableProgram employeeComparableProgram) {
		//return Integer.compare(age, employeeComparableProgram.age); //line 50 and line 64 are same meaning
	//return Integer.this.age.compareTo(employeeComparableProgram.age); this line gives an compilation error
//	if(this.age==employeeComparableProgram.age) {
//		return 0;
//		
//	}
//	else if(this.age<employeeComparableProgram.age) {
//		return -1;
//		
//	}else {
//		return 1;
//		
//	}
//	
	return(this.age==employeeComparableProgram.age) ? 0: ((this.age<employeeComparableProgram.age)?-1:1);
		 
	}
//To get the value for each attribute instead of object value , the below method can be uncommented or in the main class we can use by object.getAge()
//@Override
//public String toString() {
//	return "EmployeeComparableProgram [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
//}
}
