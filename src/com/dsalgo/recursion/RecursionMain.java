package com.dsalgo.recursion;

public class RecursionMain {

	public static void main(String[] args) {
		
		System.out.println("Factorial of 5: "+findFactorialRecursive(2));
		System.out.println("Factorial of 5: "+findFactorialIterative(2));
		System.out.println("Fibonacci of 8: "+findFibonacciRecursive(8));
		System.out.println("Fibonacci of 8: "+findFibanocciIterative(8));
		System.out.println("Fibonacci of 8: "+fibnoacciRecursive2(8));
		System.out.println("Reverse String -Iterative: "+reverse("Testing"));
		System.out.println("Reverse String -Recursive: "+reverse2("Testing"));
		System.out.println("Reverse String -Recursive: "+reverseStringRecursive("Testing"));
		System.out.println("String length : "+stringLengthByRecursive("Test"));
		System.out.println("Check Palindrome : "+checkPalindrome("2668662"));

	}
	/**
	 * Factorial by Recursion
	 * @param number
	 * @return
	 */
	public static int findFactorialRecursive(int number){
		int counter = number;
		if(counter==1) {
			return counter;
		}else {
			counter = counter-1;
			return number*findFactorialRecursive(counter);
		}
	}
	/**
	 * Factorial by Iterative
	 * @param number
	 * @return
	 */
	public static int findFactorialIterative(int number){
		int result = 1;
		while(number>0) {
			result = result * number;
			number--;
		}
		return result;
	}
	/*
	 * Fibonacci by Recursive Approach 1
	 */
	public static int findFibonacciRecursive(int number) {
		int a =0;
		int b= 1;
		int c = a+b;
		int counter = 2;
		if(number ==0) {
			return a;
		}else if(number==1) {
			return b;
		}else {
			return computeFibonacci(b,c,number,counter);
		}
	}
	private static int computeFibonacci(int b,int c,int number,int counter) {
		if(number==counter) {
			return c;
		}
		else {
			int d = b+c;
			b = c;
			c =d;
			counter++;
			return computeFibonacci(b, c, number, counter);
		}
	}
	/*
	 * Fibonacci by Recursive Approach 2
	 */
	public static int fibnoacciRecursive2(int number) {
		if(number<2) {
			return number;
		}else {
			return fibnoacciRecursive2(number-1)+fibnoacciRecursive2(number-2);
		}
	}
	/*
	 * Fibonacci by Iterative
	 */
	public static int findFibanocciIterative(int number) {
		if(number==0 ||number==1) {
			return number;
		}else {
			int a =0;
			int b= 1;
			int c = a+b;
			int counter = 2;
			while(counter!=number) {
				int d = b+c;
				b = c;
				c =d;
				counter++;
			}
			return c;
		}
	}
	
	/**
	 * Reverse String Iteratively
	 */
	public static String reverse(String input) {
		String reverse ="";
		int len = input.length();
		while(len!=0) {
			reverse = reverse+input.charAt(len-1);
			len--;
		}
		return reverse;
    }
	/**
	 * Reverse String Recursive Approach 1
	 * @param input
	 * @return
	 */
	public static String reverse2(String input) {
		String result="";
		if(input.length()==0) {
			return result;
		}
		result = input.substring(input.length()-1, input.length())+
				reverse2(input.substring(0, input.length()-1));
		return result;
    }
	
	/**
	 * Reverse String Approach 2
	 */
	 public static String reverseStringRecursive(String string) {
	        if (string.equals("")) {
	            return "";
	        }
	        return reverseStringRecursive(string.substring(1)) + string.charAt(0);
	    }
	 
	 /**
	  * Length of the string using recursion
	  */
	 public static int stringLengthByRecursive(String str) {
		 if(str==null || str.equalsIgnoreCase("")) {
			 return 0;
		 }else {
			 return 1+ stringLengthByRecursive(str.substring(1));
		 }
	 }
	 /**
	  * Check if a string palindrome by recursion
	  *
	  */
	 public static boolean checkPalindrome(String number) {
		 if(number==null) {
			 return false;
		 }else if(number.length()==1||number.length()==0){
			 return true;
		 }else {
			 return (number.charAt(0)==number.charAt(number.length()-1)) && 
					 checkPalindrome(number.substring((number.length()-(number.length()-1)), 
					 number.length()-1));
		 }
	 }
}
