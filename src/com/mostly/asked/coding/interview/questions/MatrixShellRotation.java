package com.mostly.asked.coding.interview.questions;

public class MatrixShellRotation {

	static void rotateReverseArray(int oneDArray[], int startIndex, int endIndex) {

		while (startIndex < endIndex) {

			int temp = oneDArray[startIndex];

			oneDArray[startIndex] = oneDArray[endIndex];

			oneDArray[endIndex] = temp;

			startIndex++;
			endIndex--;

		}

	}

	static void constructTwoDArray(int constructTwoArray[][], int oneDArray[], int shell) {

		int minR = shell - 1;
		int minC = shell - 1;

		int maxR = constructTwoArray.length - shell;

		int maxC = constructTwoArray[0].length - shell;

		int index = 0;

		for (int i = minR, j = minC; i <= maxR; i++) { // Left Side LayOut

			constructTwoArray[i][j] = oneDArray[index];
			index++;
		}
		minC++;

		for (int i = maxR, j = minC; j <= maxC; j++) { // Bottom Side LayOut

			constructTwoArray[i][j] = oneDArray[index];
			index++;
		}
		maxR--;

		for (int i = maxR, j = maxC; i >= minR; i--) { // Right Side LayOut
			constructTwoArray[i][j] = oneDArray[index];
			index++;
		}
		maxC--;

		for (int i = minR, j = maxC; j >= minC; j--) { // Top Side LayOut

			constructTwoArray[i][j] = oneDArray[index];
			index++;
		}

	}

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "  ");

			}
			System.out.println();
		}

		int shell = 2;
		int rotation = 1;  
		
		
		// if in case rotattion value higher size of array that time 
//		
//		      rotation=rotation%oneDArray.length;
//		
////		case 2:
//		
////		if in case rotation value gives in negative that time
//		
//		rotation =rotation+oneDArray.length;
		
		

		int minC = shell - 1;
		int minR = shell - 1;

		int maxC = arr[0].length - shell;
		int maxR = arr.length - shell;

		int size = 2 * (maxR - minR + maxC - minC);

//		 Create oneDArray

		int oneDArray[] = new int[size];

		int index = 0;

		for (int i = minR, j = minC; i <= maxR; i++) { // left Side LayOut

			oneDArray[index] = arr[i][j];
			index++;

		}
		minC++;

		for (int i = maxR, j = minC; j <= maxC; j++) { // bottom Side LayOut

			oneDArray[index] = arr[i][j];
			index++;
		}
		maxR--;

		for (int i = maxR, j = maxC; i >= minR; i--) { // Right Side LayOut
			oneDArray[index] = arr[i][j];
			index++;
		}
		maxC--;

		for (int i = minR, j = maxC; j >= minC; j--) { // Top Side LayOut

			oneDArray[index] = arr[i][j];
			index++;
		}

		System.out.println("\n" + "Extract From OneD Array" + "\n");

		for (int i : oneDArray) {
			System.out.print(i + " ");
		}

		System.out.println("\n" + "------");

		rotateReverseArray(oneDArray, 0, oneDArray.length - 1 - rotation);

		for (int i : oneDArray) {
			System.out.print(i + " ");
		}

		System.out.println("\n" + "------");

		rotateReverseArray(oneDArray, oneDArray.length - rotation, oneDArray.length - 1);

		for (int i : oneDArray) {
			System.out.print(i + " ");
		}

		System.out.println("\n" + "------");

		rotateReverseArray(oneDArray, 0, oneDArray.length - 1);

		for (int i : oneDArray) {
			System.out.print(i + " ");
		}

		System.out.println("\n" + "Construct Two D Array" + "\n");

		int constructTwoArray[][] = new int[4][4];

		constructTwoDArray(constructTwoArray, oneDArray, shell);

		for (int i = 0; i < constructTwoArray.length; i++) {
			for (int j = 0; j < constructTwoArray[i].length; j++) {

				System.out.print(constructTwoArray[i][j] + "  ");

			}
			System.out.println();
		}

	}

}
