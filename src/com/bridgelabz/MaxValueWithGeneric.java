package com.bridgelabz;

public class MaxValueWithGeneric {

	public static void MaxStrValue (String x, String y, String z){
		String str1 = x;
		String str2 = y;
		String str3 = z;
		String max = str1;
		if(str2.compareTo(max)>0) {
			max = str2;
		}
		if(str3.compareTo(max)>0) {
			max = str3;
		}
		System.out.println("Maximum number is "+max);
	}

	public static void main(String[] args) {
		MaxStrValue("Apple","Peach","Banana");
		System.out.println("Test Case 1 keeping max at position 1");
		MaxStrValue("Peach","Apple","Banana");
		System.out.println("Test Case 2 keeping max at position 2");
		MaxStrValue("Apple","Peach","Banana");
		System.out.println("Test Case 3 keeping max at position 3");
		MaxStrValue("Apple","Banana","Peach");
	}
}
