package com.example.demo.samplePrograms;

import java.util.Comparator;

public class StudentNameComparator  implements Comparator<StudentComparatorProgram>{

	@Override
	public int compare(StudentComparatorProgram o1, StudentComparatorProgram o2) {
		// TODO Auto-generated method stub
		//return .compare(o1.getSname(), o2.getSname());
		return o1.sname.compareTo(o2.sname);
	}

}
