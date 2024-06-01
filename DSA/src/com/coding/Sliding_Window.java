package com.coding;

public class Sliding_Window {

	public static void min_max_window(int[] arr, int N) {
		int min, max;
		for (int front = 0, rear = N - 1; rear <= arr.length - 1; front++, rear++) {
			min=max=arr[front];
		}

	}

	public static void main(String[] args) {
		int[] data = { 10, 3, 12, 50, 40, 15, 60, 1 };
		int N = 4;
		min_max_window(data, N);

	}

}
