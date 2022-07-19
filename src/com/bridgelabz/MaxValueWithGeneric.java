package com.bridgelabz;

public class MaxValueWithGeneric {
	public static void MaxFloatValue(float x, float y, float z){
		Float num1 = x;
		Float num2 = y;
		Float num3 = z;
		Float max = num1;
		if(num2.compareTo(max)>0) {
			max = num2;
		}
		if(num3.compareTo(max)>0) {
			max = num3;
		}
		System.out.println("Maximum number is "+max);
	}

	public static void main(String[] args) {
		MaxFloatValue(8.0f,5.0f,18.5f);
		System.out.println("Test Case 1 keeping max at position 1");
		MaxFloatValue(18.5f,5.0f,8.0f);
		System.out.println("Test Case 2 keeping max at position 2");
		MaxFloatValue(5.0f,18.5f,8.0f);
		System.out.println("Test Case 3 keeping max at position 3");
		MaxFloatValue(8.0f,5.0f,18.5f);
	}
}
