package com.binde.spring;

public class Employee {
	private Integer empNo;
	private String empName;
	private Float empSal;
    
	public Employee(Integer empNo, String empName, Float empSal) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empSal = empSal;
	}

	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

}
