package Array;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int arr[]= {4,7,8,5,6,3,2,9,1};
		Arrays.sort(arr);
		System.out.println("The values are in Accending order");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
