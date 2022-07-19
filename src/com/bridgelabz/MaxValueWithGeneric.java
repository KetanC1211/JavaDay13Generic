package com.bridgelabz;

public class MaxValueWithGeneric {
	public static void MaxIntValue(int x, int y, int z){
		Integer num1 = x;
		Integer num2 = y;
		Integer num3 = z;
		Integer max = num1;
		if(num2.compareTo(max)>0) {
			max = num2;
		}
		if(num3.compareTo(max)>0) {
			max = num3;
		}
		System.out.println("Maximum number is "+max);
	}

	public static void main(String[] args) {
		MaxIntValue(8,5,18);
		System.out.println("Test Case 1 keeping max at position 1");
		MaxIntValue(18,5,8);
		System.out.println("Test Case 2 keeping max at position 2");
		MaxIntValue(5,18,8);
		System.out.println("Test Case 3 keeping max at position 3");
		MaxIntValue(8,5,18);
	}
}

