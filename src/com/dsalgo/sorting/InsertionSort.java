package com.dsalgo.sorting;

import java.util.ArrayList;

public class InsertionSort {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> inputArray = new ArrayList<Integer>();
		inputArray.add(99);
		inputArray.add(44);
		inputArray.add(6);
		inputArray.add(2);
		inputArray.add(1);
		inputArray.add(5);
		inputArray.add(63);
		inputArray.add(87);
		inputArray.add(283);
		inputArray.add(4);
		inputArray.add(0);
		System.out.println("Insertion Sort Input");
		inputArray = insertionSort2(inputArray);
		System.out.println("Sorted Array: "+inputArray);
	}
	/**
	 * Insertion sort- Approach 1
	 * @param input
	 * @return
	 */
	public static ArrayList<Integer> insertionSort(ArrayList<Integer> input) {
		for(int i=0;i<input.size();i++) {
			if(input.get(i)<=input.get(0)) {
				input.add(0, input.remove(i));
			}else {
				if(input.get(i)<input.get(i-1)) {
					for(int j=1;j<i;j++) {
						if(input.get(j)>input.get(i)) {
							input.add(j,input.remove(i));
							break;
						}
					}
				}
			}
		}
		return input;
	}
	/**
	 * Insertion Sort Approach 2
	 * @param input
	 * @return
	 */
	public static ArrayList<Integer> insertionSort2(ArrayList<Integer> input) {
		for(int i=1;i<input.size();i++)
			for(int j=0;j<i;j++){
				if(input.get(i)<=input.get(j)) {
					input.add(j, input.remove(i));
					break;
				}
		}
		return input;
	}

}
