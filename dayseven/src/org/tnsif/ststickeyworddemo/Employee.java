package org.tnsif.ststickeyworddemo;

public class Employee {
	private int empNo;
	private String empName;
	static String companyName="TNS India Foundation";
	public Employee(int empNo, String empName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + "]";
	}
	
	

}
