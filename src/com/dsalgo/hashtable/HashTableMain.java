package com.dsalgo.hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashTableMain {

	public static void main(String[] args) {
		MyHashTable ht = new MyHashTable(50);
		System.out.println("Adding grapes");
		ht.set("grapes", 10000);
		System.out.println("Adding oranges");
		ht.set("oranges", 2000);
		System.out.println("Adding pears");
		ht.set("pears", 20);
		System.out.println("Grapes "+ht.get("grapes")+" and oranges "+ht.get("oranges"));
		System.out.println("list of keys: " + Arrays.toString(ht.getKeys()));
		int[] inputArray = {1,2,3,9,5,6,7};
		System.out.println("First Recurring Number is :" + findFirstRecurringNumber(inputArray));

	}
	//Google Question
	//Given an array = [2,5,1,2,3,5,1,2,4]:
	//It should return 2

	//Given an array = [2,1,1,2,3,5,1,2,4]:
	//It should return 1

	//Given an array = [2,3,4,5]:
	//It should return undefined

	public static Integer findFirstRecurringNumber(int[] input) {
		Map<Integer,Integer> recurringMap = new HashMap<Integer,Integer>();
		for(int i =0; i< input.length; i++) {
			if(recurringMap.get(input[i])!=null) {
				if(recurringMap.get(input[i])>=1){
					return input[i];
				}else{
					recurringMap.put(input[i], recurringMap.get(input[i])+1);
				}
			}else {
				recurringMap.put(input[i], 1);
			}
		}
		return null;
	}

}
