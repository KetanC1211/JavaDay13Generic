package com.bridgelabz;

public class MaxValueWithGeneric {

	public static < T extends Comparable <T> > void maxValue(T[] inputArray) {  

		int n = inputArray.length;
		for (int i = 0; i < n-1; i++){
			for (int j = 0; j < n-i-1; j++){
				if (inputArray[j].compareTo(inputArray[j+1]) > 0) {
					T temp = inputArray[j];
					inputArray[j] = inputArray[j+1];
					inputArray[j+1] = temp;
				}
			}
		}
		printMax(inputArray);
	}
	public static <T> void printMax(T [] inputArray) {
		int z = inputArray.length;
		System.out.println(inputArray[z-1]);
	}
	public static void main( String args[] ) {
		Integer [] intArray = {5,2,3,7,8,4};
		Double[] doubleArray = { 10.0, 20.0, 30.0, 40.0, 50.0 };    
		String [] stringArray = {"Apple","Peach","Banana","Kiwi"};

		System.out.println( "Finding Maximum Integer Array" );  
		maxValue( intArray );   

		System.out.println( "Finding Maximum Double Array" );  
		maxValue( doubleArray ); 

		System.out.println( "Finding Maximum String Array" );  
		maxValue( stringArray ); 
	}   
}

