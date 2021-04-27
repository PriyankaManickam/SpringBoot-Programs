package com.example.demo.samplePrograms;

public class StudentComparatorProgram {

	 int srollno;
	 String sname;
	 int sage;
	
	
	public int getSrollno() {
		return srollno;
	}
	public void setSrollno(int srollno) {
		this.srollno = srollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public StudentComparatorProgram(int srollno, String sname, int sage) {
		super();
		this.srollno = srollno;
		this.sname = sname;
		this.sage = sage;
	}
}
