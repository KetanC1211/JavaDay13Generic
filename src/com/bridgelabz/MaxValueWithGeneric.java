package com.bridgelabz;

public class MaxValueWithGeneric {

	public static < T extends Comparable <T> > void MaxValue(T[] inputArray) {  

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
		System.out.println(inputArray[n-1]);
	}
	public static void main( String args[] ) {
		Integer [] intArray = {5,2,3,7,8,4};
		Double[] doubleArray = { 10.0, 20.0, 30.0, 40.0, 50.0 };    
		String [] stringArray = {"Apple","Peach","Banana","Kiwi"};

		System.out.println( "Finding Maximum Integer Array" );  
		MaxValue( intArray );   

		System.out.println( "Printing Character Array" );  
		MaxValue( doubleArray ); 

		System.out.println( "Printing String Array" );  
		MaxValue( stringArray ); 
	}   
}

