package com.corejava;

import java.util.Arrays;

public class BinarySearchDemo {
	public static void main(String[] args) {
		int [] arr = {1,2,73,41,55,16,27,98,9};
		//Arrays.sort(arr);
		//int k = 3;
		//Arrays.fill(arr, k);
		//System.out.println(Arrays.binarySearch(arr,k));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
