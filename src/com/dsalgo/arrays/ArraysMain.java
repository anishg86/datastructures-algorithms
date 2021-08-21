package com.dsalgo.arrays;

import java.util.ArrayList;

public class ArraysMain {
	
	public static MyArray<String> strArray = new MyArray<String>(10);

	public static void main(String[] args) {
		int[] array1 = {0,3,4,31};
		int[] array2 = {4,6,30};
		strArray.add("Anish");
		strArray.add("Sachin");
		strArray.add("Gayatri");
		strArray.add("Satvik");
		//System.out.println(strArray.get(2));
		//System.out.println(strArray.removeAt(2));
		//System.out.println(reverseString("Hi My Name is Anish"));

		//System.out.println(array1.toString());
		mergeSortedArrays(array1,array2);

	}
	/*
	 * Reverse a String
	 */
	public static String reverseString(String input) {
		int len = input.length();
		String output ="";
		for(int i=0,j=len-1;i<len;i++,j--) {
			output = output+input.charAt(j);
		}
		return output;
	}
	/*
	 * Merge two sorted Arrays
	 */
	public static void mergeSortedArrays(int[] input1, int[] input2) {
		int mergedArrayLen = input1.length + input2.length;
		int[] mergedArray = new int[mergedArrayLen];
		int i =0;
		int j= 0;
		int t=0;
		while(mergedArrayLen>0) {
			if(i>=input1.length) {
				mergedArray[t]=input2[j];
			}else if(j>=input2.length) {
				mergedArray[t]=input1[i];
			}else if(input1[i]<=input2[j] && i<=input1.length-1) {
				mergedArray[t]=input1[i];
				i++;
				t++;
			}else if(input1[i]>=input2[j] && j<=input2.length-1) {
				mergedArray[t]=input2[j];
				j++;
				t++;
			}
			mergedArrayLen--;
		}
		for(int k=0;k<mergedArray.length;k++) {
			System.out.println(mergedArray[k]);
		}
	}

}
