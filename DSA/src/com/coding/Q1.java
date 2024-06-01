package com.coding;

public class Q1 {
	static boolean pair_present(int arr[], int target) {
		for(int i=0;i< arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target)
				return true;
			}	
		}
		return false;
	}
		
	public static void main(String[] args) {
		int [] array = {1, 4, 5, 6, 8}; 
		int target = 9;
		System.out.println(pair_present(array, target));

	}

}
