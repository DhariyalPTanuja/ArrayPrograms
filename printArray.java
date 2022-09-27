package com.bridgelabs.arrayproblem;

import java.util.Scanner;

public class printArray {

	
	int arraySize;
	int elementArray[];
	
	public static void main(String[] args) {
		
		printArray objArray = new printArray();
		objArray.printArrayElement();

	}

	// 1) Java Program to print the elements of an array

	public void printArrayElement() {
		
		Scanner scanobj = new Scanner(System.in);
		System.out.println("enter the size of array");
		arraySize = scanobj.nextInt();
		int elementArray[] = new int[arraySize];
		System.out.println("enter the array element");
		for (int i = 0; i < arraySize; i++) {
			System.out.println("enter the array " + (i+1) + " element :" );
			elementArray[i] = scanobj.nextInt();
		}
		
		System.out.println("print the element of Array ");
		for (int j = 0; j < arraySize; j++) {
			System.out.println(elementArray[j]);
		}

	}
	
}