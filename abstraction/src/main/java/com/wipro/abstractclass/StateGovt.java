package com.wipro.abstractclass;

// class extends class
public class StateGovt extends Covid {
	@Override
	void mask() {
		System.out.println("Mask : 500 Fine");
	}
	@Override
	void socialDistance() {
		System.out.println("Social Distance : 100 Fine");
	}
}
