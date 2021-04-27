package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.samplePrograms.EmployeeComparableProgram;
//import com.example.demo.samplePrograms.EmployeeComparableProgram;
import com.example.demo.samplePrograms.StudentAgeComparator;
import com.example.demo.samplePrograms.StudentComparatorProgram;
import com.example.demo.samplePrograms.StudentNameComparator;

@SpringBootApplication
public class BasicExamplesProgramApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicExamplesProgramApplication.class, args);

		ArrayList<EmployeeComparableProgram> object1 = new ArrayList<EmployeeComparableProgram>();
		object1.add(new EmployeeComparableProgram(1, "pri", 79, 10000));
		object1.add(new EmployeeComparableProgram(2, "divya", 21, 2000));
		object1.add(new EmployeeComparableProgram(3, "moni", 80, 2000));

		System.out.println("-----------Comparable Program----------");
		System.out.println("------Before Sorting--------");
		object1.forEach(employeeComparableProgram -> System.out.println("Id " + employeeComparableProgram.getId()
				+ " name " + employeeComparableProgram.getName() + " age " + employeeComparableProgram.getAge()));
		Collections.sort(object1);

		System.out.println("--------After Sorting--------");
		object1.forEach(employeeComparableProgram -> System.out.println("Id " + employeeComparableProgram.getId()
				+ " name " + employeeComparableProgram.getName() + " age " + employeeComparableProgram.getAge()));
		Collections.reverse(object1);
		System.out.println("------After Sorting in reverse order-------");
		object1.forEach(employeeComparableProgram -> System.out.println("Id " + employeeComparableProgram.getId()
				+ " name " + employeeComparableProgram.getName() + " age " + employeeComparableProgram.getAge()));

		// System.out.println("After Sorting in reverse order" + object1);

		// for(EmployeeComparableProgram object2 :object1) { //
		// System.out.println("Age" + object2.getAge()); // }

		System.out.println("--------Comparator  Program-------------");
		ArrayList<StudentComparatorProgram> studentComparatorProgramObject = new ArrayList<StudentComparatorProgram>();
		studentComparatorProgramObject.add(new StudentComparatorProgram(56, "priyanka", 77));
		studentComparatorProgramObject.add(new StudentComparatorProgram(57, "monika", 22));
		studentComparatorProgramObject.add(new StudentComparatorProgram(58, "divya", 61));

		System.out.println("--------Age comparator-----------");
		System.out.println("---Before Sorting----");
		studentComparatorProgramObject.forEach(
				l -> System.out.println("roll No " + l.getSrollno() + " name " + l.getSname() + " age " + l.getSage()));

		System.out.println("-----After Sorting-----");
		Collections.sort(studentComparatorProgramObject, new StudentAgeComparator());
		studentComparatorProgramObject.forEach(
				l -> System.out.println("roll No " + l.getSrollno() + " name " + l.getSname() + " age " + l.getSage()));

		System.out.println("------After Sorting in reverse order------");
		Comparator<StudentComparatorProgram> comparatorObject5 = Collections.reverseOrder(new StudentAgeComparator());
		Collections.sort(studentComparatorProgramObject, comparatorObject5);
		studentComparatorProgramObject.forEach(
				l -> System.out.println("roll No " + l.getSrollno() + " name " + l.getSname() + " age " + l.getSage()));

		System.out.println("----------Name comparator----------");
		System.out.println("-------Before Sorting--------");
		studentComparatorProgramObject.forEach(
				l -> System.out.println("roll No " + l.getSrollno() + " name " + l.getSname() + " age " + l.getSage()));

		System.out.println("------After Sorting-------");
		Collections.sort(studentComparatorProgramObject, new StudentNameComparator());
		studentComparatorProgramObject.forEach(
				l -> System.out.println("roll No " + l.getSrollno() + " name " + l.getSname() + " age " + l.getSage()));

		System.out.println("-----After Sorting in reverse order-----");
		Comparator<StudentComparatorProgram> comparatorObject = Collections.reverseOrder(new StudentNameComparator());
		Collections.sort(studentComparatorProgramObject, comparatorObject);
		studentComparatorProgramObject.forEach(
				l -> System.out.println("roll No " + l.getSrollno() + " name " + l.getSname() + " age " + l.getSage()));
	}

}
