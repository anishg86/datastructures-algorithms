package com.dsalgo.sorting;

import java.util.Arrays;

public class BubbleSort {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
		System.out.println("Bubble Sort Input");
		inputArray = bubbleSort(inputArray);
		System.out.println("Sorted Array: "+Arrays.toString(inputArray));
	}
	
	public static int[] bubbleSort(int[] input) {
		int temp;
		int len = input.length;
		for(int i=0;i<len-1;len--)
			for(int j=0;j<len-1;j++){
			if(input[j]>input[j+1]) {
				temp = input[j];
				input[j] = input[j+1];
				input[j+1] = temp;
			}
		}
		return input;
	}

}
