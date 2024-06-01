package com.coding;

public class Q2 {
	
		static int max_prof(int [] arr) {
			int max=0;
			for(int i=0;i< arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					
					if((arr[j]-arr[i])>max) { 
						max= arr[j]- arr[i];
						System.out.println("Day: "+i+1+ " Buy at: " +arr[i]+ " Sale at:"+arr[j]+" profit: "+max);
					}
				}
			}
		return max;
			}
			
		
	public static void main(String[] args) {
		int price []= {	7, 1, 5, 3, 6, 8};
		System.out.println(max_prof(price));
	}

}
