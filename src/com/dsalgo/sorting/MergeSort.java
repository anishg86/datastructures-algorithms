package com.dsalgo.sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> inputArray = new ArrayList<Integer>();
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
		 
		System.out.println("Merge Sort Input");
		inputArray = mergeSort(inputArray);
		System.out.println("Sorted Array: "+inputArray);
	}
	
	public static List<Integer> mergeSort(List<Integer> input) {
		if(input.size()==1) {
			return input;
		}else {
			int n = input.size();
			List<Integer> left = input.subList(0, n/2);
			List<Integer> right = input.subList((n/2), n);
	 
			return merge(mergeSort(left),mergeSort(right));
		}
	}
	/**
	 * Merge Sort Approach 1
	 * @param left
	 * @param right
	 * @return
	 */
	public static List<Integer> merge(List<Integer> left,List<Integer> right) {
		List<Integer> mergeArray = new ArrayList<Integer>();
		int leftLen = left.size();
		int rightLen = right.size();
		int len = leftLen+rightLen;
		int i=0;
		int j=0;
		while(len!=0) {
			if(i<leftLen && j<rightLen && left.get(i)<right.get(j)) {
				mergeArray.add(left.get(i));
				i++;
				len--;
				continue;
			}else if(i<leftLen && j<rightLen && left.get(i)>right.get(j)) {
				mergeArray.add(right.get(j));
				j++;
				len--;
				continue;
			}else if(i<leftLen && j>= rightLen) {
				mergeArray.add(left.get(i));
				i++;
				len--;
				continue;
			}else if(j<rightLen && i>= leftLen) {
				mergeArray.add(right.get(j));
				j++;
				len--;
				continue;
			}
		}
		return mergeArray;
	}
	
	/**
	 * Merge Sort Approach 2
	 * @param left
	 * @param right
	 * @return
	 */
    public static List<Integer> merge2(List<Integer> left, List<Integer> right) {
        ArrayList<Integer> result = new ArrayList<>();
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex) < right.get(rightIndex)) {
                result.add(left.get(leftIndex));
                leftIndex++;
            } else {
                result.add(right.get(rightIndex));
                rightIndex++;
            }
        }
        List<Integer> leftRemaining = left.subList(leftIndex, left.size());
        List<Integer> rightRemaining = right.subList(rightIndex, right.size());

        result.addAll(leftRemaining);
        result.addAll(rightRemaining);

        return result;
    }

}
