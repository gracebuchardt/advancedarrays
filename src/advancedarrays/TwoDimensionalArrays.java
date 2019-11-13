 package advancedarrays;

import java.util.Random;
import java.util.Scanner;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		
		
		
		//ALL of THIS is copy pasted from 'arrays solution' github
		
		Scanner in=new Scanner(System.in);
		Random rnd=new Random();
		//Variables
		int[] arr1, arr2;
		int[] mergeArray, finalArray;
		int counter=0;
		boolean[] inArray= {false,false,false,false,false,false,false,false,false,false};
		
		
		//Ask the user for the length of two arrays
		System.out.println("Give me the length of array 1:" );
		int size1=in.nextInt();
		System.out.println("Give me the length of array 2:");
		int size2=in.nextInt();
		//Read in the lengths
		//Create the arrays
		arr1=new int[size1];
		arr2=new int[size2];
		//Fill them with random numbers
		for (int x=0;x<arr1.length;x++) {
			arr1[x]=rnd.nextInt(10);
		}
		
		for (int x=0;x<arr2.length;x++) {
			arr2[x]=rnd.nextInt(10);
		}
		//Merge the arrays
		//Create a new array for the merge
		mergeArray=new int[arr1.length+arr2.length];
		//Loop through array one and make sure the element is not in the new array
		for (int x=0;x<arr1.length;x++) {
			if (!inArray[arr1[x]]) {
				inArray[arr1[x]]=true;
				mergeArray[counter]=arr1[x];
				counter++;
			}
		}
			//add the value
		//Loop through array two and do the same thing
		for (int x=0;x<arr2.length;x++) {
			if (!inArray[arr2[x]]) {
				inArray[arr2[x]]=true;
				mergeArray[counter]=arr2[x];
				counter++;
			}
		}
		//Find out the total size of the new array, make a final fourth array
		finalArray=new int[counter];
		//Add all the elements
		for (int x=0;x<finalArray.length;x++) {
			finalArray[x]=mergeArray[x];
			System.out.println(finalArray[x]);
		}
		//print the final
		
		in.close();
	}
		

	}


