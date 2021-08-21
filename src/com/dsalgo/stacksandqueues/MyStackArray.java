package com.dsalgo.stacksandqueues;

import java.util.ArrayList;
import java.util.List;

public class MyStackArray {
	
	private List data;
	public MyStackArray() {
		this.data = new ArrayList();
	}
	
	public void push(Object value) {
		if(data.size()==0) {
			data.add(value);
		}
	}
	
	public void pop() {
		if(data.size()!=0) {
			data.remove(data.size()-1);
		}
	}
	
	public Object peek() {
		if(data.size()!=0) {
			return data.get(data.size()-1);
		}
		return null;
	}
	
	public int size() {
		return this.data.size();
	}

}
