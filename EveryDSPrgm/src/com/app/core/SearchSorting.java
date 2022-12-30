package com.app.core;

import javax.xml.transform.Templates;

public class SearchSorting {

	public static int BinarySer(int[] arr, int data) {

		int low = 0;
		int high = arr.length - 1;
		int mid;
		while (low <= high) {
			mid = (low + high) / 2;

			if (data == arr[mid]) {
				return mid;
			}

			if (data < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}
		return -1;
	}

	public static int linearSearch(int[] arr, int key) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void bubbleSort(int[] arr) {
		int p = arr.length - 1;
		int c = arr.length - 1;

		for (int i = 0; i < p; i++) {
			for (int j = 0; j < (c - i); j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			if (minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}

	public static void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j != i; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

//	public static int partition(int[] arr, int start, int end) {
//
//		int pivot = arr[start];
//		int left = start;
//		int right = end;
//		while (left < right) {
//			while (arr[left] <= pivot) {
//				left++;
//			}
//
//			while (arr[right] > pivot) {
//				right--;
//			}
//
//			if (left < right) {
//				int temp = arr[left];
//				arr[left] = arr[right];
//				arr[right] = temp;
//
//			}
//		}
//		int temp = arr[start];
//		arr[start] = arr[right];
//		arr[right] = temp;
//		return right;
//	}

	public static int partition(int[] arr, int left, int right) {
		int pivot = arr[left];
		int start = left;
		int end = right;

		while (start < end) {
			while (arr[start] <= pivot) {
				start++;
			}

			while (arr[end] > pivot) {
				end--;
			}
			if (start < end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}
		}
		int temp = arr[left];
		arr[left] = arr[end];
		arr[end] = temp;
		
		return end;
	}

	public static void quickSort(int arr[], int left, int right) {
		if (left < right) {
			int loc = partition(arr, left, right);
			quickSort(arr, left, loc - 1);
			quickSort(arr, loc + 1, right);
		}
	}

	public static void mergeSort(int[] arr, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}

	public static void merge(int[] arr, int left, int mid, int right) {
		int i = left;
		int j = mid + 1;
		int k = left;
		int[] temp = new int[right + 1];
		while (i <= mid && j <= right) {

			if (arr[i] <= arr[j]) {
				temp[k] = arr[i];
				i++;
				k++;
			} else {
				temp[k] = arr[j];
				j++;
				
				k++;
			}
		}
		if (i > mid) {
			while (j <= right) {
				temp[k] = arr[j];
				j++;
				k++;
			}
		} else {
			while (i <= mid) {
				temp[k] = arr[i];
				i++;
				k++;
			}
		}

		for (int m = left; m <= right; m++) {
			arr[m] = temp[m];
		}
	}
}