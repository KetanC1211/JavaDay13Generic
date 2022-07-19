package com.bridgelabz;

public class MaxValueWithGeneric {

	public static <T extends Comparable<T>> T maxValue(T value1, T value2, T value3) {
		T max = value1;
		if (value2.compareTo(max) > 0)
		max = value2;
		if (value3.compareTo(max) > 0)
		max = value3;
		return max;
		}

	public static void main(String[] args) {
		System.out.println("Maximum String Value is "+maxValue(18,5,8));
		System.out.println("Maximum String Value is "+maxValue(2.5f,3.3f,1.1f));
		System.out.println("Maximum String Value is "+maxValue("Apple","Banana","Peach"));

	}
}
