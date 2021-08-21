package com.dsalgo.sorting;

import java.util.Arrays;

public class SelectionSort {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
		System.out.println("Selection Sort Input");
		inputArray = selectionSort(inputArray);
		System.out.println("Sorted Array: "+Arrays.toString(inputArray));
	}
	
	public static int[] selectionSort(int[] input) {
		int smallestIndex =0;
		int smallestValue =0;
		int len = input.length;
		for(int i=0;i<len;i++) 
		{
			for(int j=i+1;j<len;j++){
				if(input[smallestIndex]>input[j]) {
					smallestIndex = j;
				}
			}
			smallestValue = input[smallestIndex];
			input[smallestIndex] = input[i];
			input[i] = smallestValue;
		}
		return input;
	}

}
