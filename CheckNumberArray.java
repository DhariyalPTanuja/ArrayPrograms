package com.bridgelabs.arrayproblem;

import java.util.Arrays;
import java.util.Scanner;

public class CheckNumberArray {
	public static int i, j;
	static Scanner scanobj = new Scanner(System.in);

	public CheckNumberArray() {

	}

	public static void main(String[] args) {

		CheckNumberArray objCheck = new CheckNumberArray();
		objCheck.chooseTheProgram();

	}

	public static void chooseTheProgram() {
		System.out.println(" program number to run : ");
		System.out.println(" enter 1 :" + "To print the elements of an array ");
		System.out.println(" enter 2 :" + "To find the frequency of each element in the array ");
		System.out.println(" enter 3 :" + "To print the largest element in an array ");
		System.out.println(" enter 4:" + "To print the smallest element in an array ");
		System.out.println(" enter 5 :" + "To print the elements of an array present on an even position ");
		System.out.println(" enter 6 :" + "To print the elements of an array in reverse order ");
		System.out.println(" enter 7 :" + "To print the elements of an array present on odd position ");
		System.out.println(" enter 8 :" + "To print the duplicate elements of an array ");
		System.out.println(" enter 9 :" + "To print to sort the elements of an array in ascending order   ");
		System.out.println(" enter 10 :" + "Find 2nd Largest Number in an Array ");
		Scanner scanobj = new Scanner(System.in);

		System.out.println("enter your choice 1 - 10");
		int choice = scanobj.nextInt();
		switch (choice) {
		case 1:
			printArrayElement();
			break;
		case 2:
			checkElementFrequency();
			break;
		case 3:
			 checkLargestElement();
			break;
		case 4:
			 checkSmallestElement();
			break;
		case 5:
			checkEvenPositionElement();
			break;
		case 6:
			printReverseElement();
			break;
		case 7:
			checkOddPositionElement();
			break;
		case 8:
			printDulplicateElement();
			break;
		case 9:
			sortingArrayElement();
			break;
		case 10:
			print2ndLargestElement();
			break;
		}

	}

	

	public static int[] inputArrayElement() {
		// Scanner scanobj = new Scanner(System.in);
		System.out.println("enter the number of the element in the  array");
		int arraySize = scanobj.nextInt();
		int elementArray[] = new int[arraySize];
		System.out.println("enter the element of Array :");
		for (i = 0; i < arraySize; i++) {
			elementArray[i] = scanobj.nextInt();
		}

		return elementArray;

	}

//1) Java Program to print the elements of an array
	public static int[] printArrayElement() {
		int[] inputArray = inputArrayElement();
		System.out.println("print the element of Array ");
		for (j = 0; j < inputArray.length; j++) {
			System.out.println(inputArray[j]);
		}
		return inputArray;

	}
//to check frequency of element
	public static void checkElementFrequency() {
		int[] storageArray = inputArrayElement(); 
		int[] frequencyArray = new int[storageArray.length];
		int allReadyVisit = -1;
		for (i = 0; i < storageArray.length; i++) {
			int counter = 1;
			for (j = i + 1; j < storageArray.length; j++) {
				if (storageArray[i] == storageArray[j]) {
					counter++;
				frequencyArray[j]=allReadyVisit;
				if(frequencyArray[i]!= allReadyVisit)
					frequencyArray[i]=counter;
			}
		}
		}
			for(int i = 0; i < frequencyArray.length; i++){
			      if(frequencyArray[i] != allReadyVisit)
			        System.out.println("Element: "+storageArray[i] + " Frequency: " + frequencyArray[i]);
			    }
		}
			
			
		
	
//3) Java Program to print the largest element in an array
	public static void checkLargestElement() {
		int[] storageArray = inputArrayElement();
		int max = storageArray[0];
		for (i = 0; i < storageArray.length; i++) {
			if (max > storageArray[i]) {
				max = storageArray[i];
			}
		}

		System.out.println("largest element in the Array : " + max);

	}

	// 4) Java Program to print the smallest element in an array
	public static void checkSmallestElement() {
		int[] storageArray = inputArrayElement();
		int min;
		for (i = 0; i < storageArray.length; i++) {

			for (j = i + 1; j < storageArray.length; j++) {
				if (storageArray[i] < storageArray[j]) {
					min = storageArray[i];
					storageArray[i] = storageArray[j];
					storageArray[j] = min;
				}
			}

		}
		System.out.println("Smallest element in the Array : " + storageArray[(storageArray.length) - 1]);

	}

	// 5) Java Program to print the elements of an array present on an even position
	public static void checkEvenPositionElement() {
		int[] storageArray = inputArrayElement();
		for (i = 0; i < storageArray.length; i++) {
			System.out.println(storageArray[i]);
			i++;
		}

	}

	// 7) Java Program to print the elements of an array present on an odd position
	public static void checkOddPositionElement() {
		int[] storageArray = inputArrayElement();
		for (i = 0; i < storageArray.length; i++) {
			System.out.println(storageArray[i + 1]);
			i++;
		}
	}

	// Java Program To print the elements of an array in reverse order
	public static void printReverseElement() {

		int[] inputArray = inputArrayElement();
		System.out.println("print the element of Array ");
		for (j = (inputArray.length) - 1; j > -1; j--) {
			System.out.println(inputArray[j]);
		}
	}
	private static void print2ndLargestElement() {
		int[] storageArray = inputArrayElement();
		int max;
		for (i = 0; i < storageArray.length; i++) {

			for (j = i + 1; j < storageArray.length; j++) {
				if (storageArray[i] > storageArray[j]) {
					max = storageArray[i];
					storageArray[i] = storageArray[j];
					storageArray[j] = max;
				}
			}

		}
		System.out.println("second largest element in the Array : " + storageArray[(storageArray.length) - 2]);

	}

	private static void sortingArrayElement() {
		int[] storageArray = inputArrayElement();
		Arrays.sort(storageArray);
	      System.out.println("sorted Array ::"+Arrays.toString(storageArray));

	}
	// To print the duplicate elements of an array
	public static void printDulplicateElement() {
		int[] inputArray = inputArrayElement();
		System.out.println("print the Duplicate element of Array ");
		for (i = 0; i < inputArray.length; i++) {
			for (j = i + 1; j < inputArray.length; j++) {
				if (inputArray[i] == inputArray[j]) {
					System.out.println(inputArray[j]);
				}
			}

		}

	}
}