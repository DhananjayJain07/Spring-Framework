package com.corejava;

public class CloneArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,2,3,4,5,6,9,8,7};
		int [] cloneArray = arr.clone();
		
		System.out.println(arr == cloneArray);
		 for (int i=0; i<cloneArray.length;i++) {
			 System.out.println(cloneArray[i]);
		 }
	}

}
