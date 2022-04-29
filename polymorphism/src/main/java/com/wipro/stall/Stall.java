package com.wipro.stall;

public class Stall {
	String name;
	String detail;
	public double computeCost(String type, int squareFeet) {

		if (type.equalsIgnoreCase("platinum")) {
			return 300 * squareFeet;
		} else if (type.equalsIgnoreCase("diamond")) {
			return 200 * squareFeet;
		} else if (type.equalsIgnoreCase("gold")) {
			return 100 * squareFeet;
		}
		return 0.0;
	}
	public double computeCost(String type, int squareFeet, int noOfTv) {
		double totalCost = 0.0;
		if (type.equalsIgnoreCase("platinum")) {
			totalCost = 300 * squareFeet;
		} else if (type.equalsIgnoreCase("diamond")) {
			totalCost = 200 * squareFeet;
		} else if (type.equalsIgnoreCase("gold")) {
			totalCost = 100 * squareFeet;
		}
		return totalCost + (noOfTv * 10000);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
}
