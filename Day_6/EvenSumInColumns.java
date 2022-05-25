package com.array;

import java.util.Arrays;

public class EvenSumInColumns {

	public static void main(String[] args) {
		
		int N=3;
		int M=3;
		int[][] arr= new int[N][M];
		
		int ele=1;
		for(int i=0; i<N;i++) {
			for(int k=0; k<M; k++) {
				arr[i][k]=ele;
				ele++;
			}
		}
		
		for(int i=0; i<arr.length;i++) {
				System.out.println(Arrays.toString(arr[i]));
		}
		
		for(int i=0; i<N;i++) {
			int sum=0;
			for(int k=0; k<M; k++) {
				if(arr[k][i]%2==0) {
					sum+=arr[k][i];
				}
			}
			System.out.println(sum);
		}
		
		
	}

}
