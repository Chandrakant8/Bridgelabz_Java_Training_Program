package DataStructureAndAlgorithm.Algorithm.Sorting;

import java.util.Arrays;

class MergeSort{
	public static void main(String[] args) {
		int[] arr = {1,8,3,6,9,0};
		int ans[] = divide(arr,0,arr.length-1);
		System.out.println(Arrays.toString(ans));
	}
	public static int[] divide(int[] arr, int i, int j) {
		if(i==j) {
			int[] t = new int[1];
			t[0] = arr[j];
			return t;
		}
		int mid = i+(j-i)/2;
		int[]lt = divide(arr,i,mid);
		int[] rt = divide(arr,mid+1,j);
		int[] ans = conqueror(lt,rt);
		return ans;
	}
	public static int[] conqueror(int[] lt, int[] rt) {
		System.out.println(Arrays.toString(lt)+" "+Arrays.toString(rt));
		int sz = lt.length + rt.length;
		int[] t = new int[sz];
		int idx = 0;
		int idx1 = 0;
		int idx2 = 0;
		while(idx1<lt.length && idx2<rt.length) {
			if(lt[idx1]<rt[idx2]) {
				t[idx++] = lt[idx1];
				idx1++;
			}
			else{
				t[idx++] = rt[idx2];
				idx2++;
			}
		}
		while(idx1<lt.length) {
			t[idx++] = lt[idx1++];
		}
		while(idx2<rt.length) {
			t[idx++] = rt[idx2++];
		}
		System.out.println(Arrays.toString(t));
		return t;
	}
}