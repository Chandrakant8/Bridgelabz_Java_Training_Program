package DataStructureAndAlgorithm.Algorithm.Searching;

import java.util.Arrays;

class LinearSearch{
	public static void main(String[] args) {
		int[] arr = {4,6,2,3,7,8};
		int key = 7;
		int idx = -1;
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i]==key) {
				idx = i;
				break;
			}
		}
		if(idx!=-1) {
			System.out.println("key is present in array at index : "+idx);
		}
		else System.out.println("key is not present in array : "+idx);
	}
}