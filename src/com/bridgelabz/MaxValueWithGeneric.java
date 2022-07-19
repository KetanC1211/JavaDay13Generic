package com.bridgelabz;

public class MaxValueWithGeneric<T extends Comparable<T>> {
	T value1, value2, value3;
	public  MaxValueWithGeneric(T value1, T value2, T value3) {
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
	}
	public static <T> void printMax(T value1, T value2, T value3,T max) {
		System.out.printf("Max of %s, %s, and %s is %s\n",value1,value2,value3,max);
	}
	
	public T maxValue () {
		return MaxValueWithGeneric.maxValue(value1,value2,value3);
	}

	public static <T extends Comparable<T>> T maxValue(T value1, T value2, T value3) {
		T max = value1;
		if (value2.compareTo(max) > 0)
		max = value2;
		if (value3.compareTo(max) > 0)
		max = value3;
		printMax(value1,value2,value3,max);
		return max;
		}

	public static void main(String[] args) {
		Integer value1Int = 18 ,value2Int = 8, value3Int = 5;
		Float value1Fl = 2.2f, value2Fl = 1.1f , value3Fl =3.3f;
		String value1Str = "Apple" , value2Str ="Peach" , value3Str = "Banana";

		new MaxValueWithGeneric(value1Int , value2Int, value3Int).maxValue();
		new MaxValueWithGeneric(value1Fl , value2Fl, value3Fl).maxValue();
		new MaxValueWithGeneric(value1Str , value2Str, value3Str).maxValue();
	}
}


