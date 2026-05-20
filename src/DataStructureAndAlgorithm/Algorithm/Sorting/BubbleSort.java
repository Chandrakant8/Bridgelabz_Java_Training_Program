package DataStructureAndAlgorithm.Algorithm.Sorting;

import java.util.Arrays;

class BubbleSort{
	public static void main(String[] args) {
		int[] arr = {1,8,3,6,9,0};
		int len = arr.length;
		for(int i=0 ; i<len-1 ; i++) {
			for(int j=i+1 ; j<len ; j++) {
				if(arr[i]>arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
