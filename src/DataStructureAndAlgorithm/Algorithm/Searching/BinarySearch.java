package DataStructureAndAlgorithm.Algorithm.Searching;

import java.util.Arrays;

class BinarySearch{
	public static void main(String[] args) {
		// before apply binary search array must be sorted
		int[] arr = {1,6,5,8,9,3};
		// first we need to sort array
		Arrays.sort(arr);
		int n = arr.length;
		int key = 9;
		int idx = binarySearch(arr,0,n-1,key);
		if(idx!=-1) {
			System.out.println("key is present in array at index : "+idx);
		}
		else System.out.println("key is not present in array : "+idx);
	}
	public static int binarySearch(int[] arr, int st, int ei, int key) {
		if(st==ei) {
			if(arr[st]==key) return st;
			return -1;
		}
		int mid = st + (ei-st)/2;
		if(arr[mid]==key) return mid;
		if(key<arr[mid]) {
			return binarySearch(arr,st,mid,key);
		}
		else return binarySearch(arr,mid+1,ei,key);
	}
}