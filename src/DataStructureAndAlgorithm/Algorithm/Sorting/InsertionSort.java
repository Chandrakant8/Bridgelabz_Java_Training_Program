package DataStructureAndAlgorithm.Algorithm.Sorting;

import java.util.Arrays;

class InsertionSort{
	public static void main(String[] args) {
		int[] arr = {3,5,1,7,0,4};
		int len = arr.length;
		for(int i=1 ; i<len ; i++) {
			int val = arr[i];
			int idx = i-1;
			while(idx>=0 && arr[idx]>val) {
				arr[idx+1] = arr[idx];
				idx--;
			}
			arr[idx+1] = val;
		}
		System.out.println(Arrays.toString(arr));
	}
}