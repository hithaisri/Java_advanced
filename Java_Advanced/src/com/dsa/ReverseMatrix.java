package com.dsa;

public class ReverseMatrix {

	public static void main(String[] args) {
		
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		reverseMatrix(a);
	}

	private static void reverseMatrix(int[][] a) {

		for (int i=0; i<3; i++)
		     for (int j = i+1; j<3; j++)      {
		       int temp = a[i][j];
		       a[i][j] = a[j][i];
		       a[j][i] = temp;
		    }

		for (int i=0; i<3; i++)
		     for (int j = 0; j<3; j++)
		     {
		System.out.println(a[i][j]);
		     }
	}
}
