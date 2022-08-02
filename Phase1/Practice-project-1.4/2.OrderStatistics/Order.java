package Orderstatistics;

import java.util.Arrays;

public class Order {
public static int KthSmallest(Integer[] arr,int k) {
		
		Arrays.sort(arr);
		//this will give you the smallest element
		return arr[k-1]; 
		
	}
	
	public static void main(String[] args) {
		
		Integer arr[]= new Integer[] {43,78,54,32,13,45,56};
		
		int k=4; // 5th smallest element
		
		System.out.println("Kth Smallest Element is : "+ KthSmallest(arr, k) );
	}


}
