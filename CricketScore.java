package com.masai;

public class CricketScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculateRuns(1,2,3,4,6);
	}
	public static void calculateRuns(int ones,int twos,int threes,int fours,int sixs) {
		System.out.println(ones+(twos*2)+(threes*3)+(fours*4)+(sixs*6));
	}

}
