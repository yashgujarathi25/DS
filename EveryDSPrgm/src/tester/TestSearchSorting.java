package tester;

import java.util.Scanner;
import static com.app.core.SearchSorting.*;
public class TestSearchSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size of array: ");
//		int size = sc.nextInt();
//		int[] arr = new int[size];
//		
//		for(int i =0; i< size ; i++) {
//			arr[i]=sc.nextInt();
//		}
//		
//		System.out.println("enter element to search :- ");
		
		int[] arr = {2,4,6,7,10,13,15};
		System.out.println(BinarySer(arr, 7));
//		int value = linearSearch(arr, 10);
//		if(value == -1) {
//			System.out.println("element not found : ");
//		}
//		else {
//			System.out.println("Element found at "+value);
//		}
		
		System.out.println(linearSearch(arr, 10));
		int[] arr2 = {10,18,7,3,4};
		bubbleSort(arr2);
		for(int e : arr2) {
			System.out.print(e+" ");
		}
		System.out.println();
		int[] arr3= {18,15,1,10,21,4,2};
		selectionSort(arr3);
		for(int e : arr3) {
			System.out.print(e+" ");
		}
		int[] arr4= {18,15,1,10,21,4,2};
		System.out.println();
		insertionSort(arr4);
		for(int e : arr4) {
			System.out.print(e+" ");
		}
		
		System.out.println();
		int[] arr5 = {11,4,3,8,9,17,31,15};
		quickSort(arr5, 0, arr5.length-1);
		
		for(int e : arr5) {
			System.out.println(e+" ");
		}
		System.out.println();
		int[] arr6 = {11,4,3,8,9,17,31,15};
		mergeSort(arr6, 0, arr6.length-1);
		
		for(int e : arr6) {
			System.out.println(e+" ");
		}
	}

}
