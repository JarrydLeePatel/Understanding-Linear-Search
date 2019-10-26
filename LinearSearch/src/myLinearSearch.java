//This is a simple Java program to understand linear searching 
//IG: Jarrydleepatel

import java.util.Scanner;

public class myLinearSearch {

	private static Scanner input;

	public int linearSearch(int[] dataset, int key) {
		
		// We need to Loop through the values of the set//
		for (int pos = 0; pos <dataset.length; pos++) {

			if (dataset[pos] == key) {
				// Value is then found//
				return pos+1;// Returns the position of he found value
			}
		}
		
		return -1;
	}

	
	
	public static void main(String args[]) {
		myLinearSearch a = new myLinearSearch();
		int[] array = {10,5,5,9,6,5,4,8};
	
		 System.out.println("Please select a value you wold like to find in the array: ");

		 Scanner input = new Scanner(System.in);
			int mykey = input.nextInt();	
		
			
		if(a.linearSearch(array, mykey)>0) {	
		System.out.print("The value "+mykey+"  is at position ");
		System.out.print(a.linearSearch(array, mykey));
		}
		else {
			System.out.println("Sorry, the value "+mykey+" is not found in this array");
		}
	}

}
