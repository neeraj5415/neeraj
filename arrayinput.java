package array;

import java.util.Scanner;

public class arrayinput {
	public static int largestInArray(int input[]) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < input.length; i++) {
			if(input[i] > max) {
				max = input[i];
			}
		}
		return max;
	}
	public static int[] takeInput() {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int input[]= new int[n];
		for(int i = 0; i < n; i++) {
			input[i]= s.nextInt();
		
	}
		return input;
	}
	public static void print(int input[]) {
		int n = input.length;
		for(int i = 0; i < n; i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = takeInput();
		print(arr);
		int largest = largestInArray(arr);
		System.out.println("largest" + largest);
		}
}