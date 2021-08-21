package com.dsalgo.arrays;

import java.util.Iterator;

public class MyArray<T> implements Iterable<T>{
	
	private T[] data;
	private int length = 0;
	private int capacity = 0;
	
	public MyArray(){
		this(16);
	}
	
	public MyArray(int capacity) {
		if(capacity<0) {
			throw new IllegalArgumentException("Illegal Argument :"+capacity);
		}else {
			data = (T[]) new Object[capacity];
		}
	}
	
	public T get(int index) {
		return this.data[index];
	}
	
	public int size() {
		return this.length;
	}
	
	public void add(T object) {
		if(length+1>capacity) {
			if(capacity == 0) {
				capacity = 1;
			}else {
				capacity*=2;
			}
			T[] newData = (T[]) new Object[capacity];
			for(int i =0; i< length; i++) {
				newData[i] = data[i];
			}
			data = newData;
		}
		data[length] = object;
		length++;
	}
	
	public T remove() {
		if(length>0) {
			T object = data[length-1];
			data[length-1] = null;
			length--;
			return object;
		}else {
			throw new IndexOutOfBoundsException("Array Empty");
		}
	}
	
	public T removeAt(int index) {
		if(length>0 && index >0 && index<length) {
			T object = data[index];
			T[] newData = (T[]) new Object[length-1];
			for(int i=0,j=0; i< length; i++,j++) {
				if(data[i]!=object) {
					newData[j]=data[i];
				}else {
					j--;
				}
			}
			data = newData;
			length--;
			return object;
		}else {
			throw new IndexOutOfBoundsException("Array Empty");
		}
	}
	
	public String toString() {
		if(length == 0) {
			return "[]";
		}else {
			StringBuilder sb = new StringBuilder();
			sb.append("[");
			for(int i =0; i< length; i++) {
				sb.append(data[i]);
				if(i+1 != length)
					sb.append(",");
			}
			sb.append("]");
			return sb.toString();
		}
		
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
