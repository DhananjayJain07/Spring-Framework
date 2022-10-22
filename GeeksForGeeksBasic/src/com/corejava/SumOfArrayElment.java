package com.corejava;

public class SumOfArrayElment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,3,4,5,6,9,8,7};
		sum(arr);

	}
	public static void sum(int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("Sum is: "+sum);
	}

}
