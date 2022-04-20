package com.binde.spring;

import java.util.*;

public class TestBean implements Test {
    private Date date;
	public TestBean(Date date) {
		super();
		this.date = date;
	}


	public void display() {
	System.out.println(date.getDate());	
	}
}
