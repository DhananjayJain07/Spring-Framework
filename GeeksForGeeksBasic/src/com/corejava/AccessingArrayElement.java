package com.corejava;

public class AccessingArrayElement {

	public static void main(String[] args) {
		
		int [] arr = new int[5];
		
		arr[0] = 34;
		arr[1] = 75;
		arr[2] = 87;
		arr[3] = 98;
		arr[4] = 9;
		/*
		for(int i =0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	
*/
		for( int a : arr) {
			System.out.println(a);
		}
	}

}
