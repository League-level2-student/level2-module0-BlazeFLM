package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		/*
		 * String[] array = new String[5]; // 2. print the third element in the array
		 * System.out.println(array[2]); // 3. set the third element to a different
		 * value array[2] = "I Need Help"; // 4. print the third element again
		 * System.out.println(array[2]); // 5. use a for loop to print all the values in
		 * the array // BE SURE TO USE THE ARRAY'S length VARIABLE for (int i = 0; i <
		 * array.length; i++) { System.out.println(array[i]); }
		 */
		// 6. make an array of 50 integers
		int[] numArray = new int[50];
		// 7. use a for loop to make every value of the integer array a random number
		Random ran = new Random();
		int random = ran.nextInt(50);
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = random;
		}
		// 8. without printing the entire array, print only the smallest number in the
		// array
		int j = Integer.MAX_VALUE;
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = ran.nextInt(50);
			if (numArray[i] < j) {
				j = numArray[i];
			}
		}
		System.out.println(j + " guess");
		// 9 print the entire array to see if step 8 was correct
		for(int i = 0; i < numArray.length; i++) {
			System.out.println(numArray[i]);
		}
		// 10. print the largest number in the array.
		int k = Integer.MIN_VALUE;
		for(int i = 0; i < numArray.length; i++) {
			numArray[i] = ran.nextInt(50);
			if(numArray[i] >  k) {
				k = numArray[i];
			}
		}
		System.out.println(k + " guess");
	}
}
