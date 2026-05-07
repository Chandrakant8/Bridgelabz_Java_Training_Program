package Core_Programming_Intermediate.Arrays.Level1;

import java.util.*;

public class MultiDimensionalArr{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// take size of row and col for 2-d array
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] mat = new int[row][col];
		for(int i=0 ; i<row ; i++) {
			for(int j=0 ; j<col ; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		// create 1-d array of size row * col
		int[] arr = new int[row*col];
		int idx = 0;
		for(int i=0 ; i<row ; i++) {
			for(int j=0 ; j<col ; j++) {
				arr[idx++] = mat[i][j];
			}
		}
		// print 1-d array
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}