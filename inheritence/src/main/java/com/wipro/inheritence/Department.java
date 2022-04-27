package com.wipro.inheritence;

public class Department extends College {

	private int deptId;
	private String deptName;
	private int noOfStudents;
	private int noOfLabs;

	public void showDetails() {

		showDetails(); // call parent Method

		System.out.println("Dept Details");
		System.out.println("Dept Id " + getDeptId());
		System.out.println("Dept Name " + getDeptName());
		System.out.println("No of Student " + getNoOfStudents());
		System.out.println("No of Labs " + getNoOfLabs());
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public int getNoOfLabs() {
		return noOfLabs;
	}

	public void setNoOfLabs(int noOfLabs) {
		this.noOfLabs = noOfLabs;
	}

}
