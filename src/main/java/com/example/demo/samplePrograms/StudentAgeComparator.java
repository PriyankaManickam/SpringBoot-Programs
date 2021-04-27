package com.example.demo.samplePrograms;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<StudentComparatorProgram>{

	@Override
	public int compare(StudentComparatorProgram o1, StudentComparatorProgram o2) {
		//return Integer.compare(o1.getSage(), o2.getSage());
		// TODO Auto-generated method stub
		return Integer.compare(o1.sage, o2.sage);
		//return Integer.compare(s1.getSage(), s2.getSage());
	}

//	@Override
//	public int compare(StudentComparatorProgram s1, StudentComparatorProgram s2) {
//		//return s1.getSage().compareTo(s2.getSage());
//		//return(s1.sage==s2.sage) ? 0: ((s1.sage<s2.sage)?-1:1);
//		//return s1.sname.compareTo(s2.sname);
//		
//		return Integer.compare(s1.getSage(), s2.getSage());
//	}
}
