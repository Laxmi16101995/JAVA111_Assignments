package com.q4;

public abstract class Shape {

	public abstract int rectangleArea(int length, int breadth);
	public abstract int squareArea(int side);
	public abstract int circleArea(int radius);
}

class Area extends Shape{

	@Override
	public int rectangleArea(int length, int breadth) {
		
		return length*breadth;
	}

	@Override
	public int squareArea(int side) {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public int circleArea(int radius) {
		// TODO Auto-generated method stub
		double a=3.14*radius*radius;
		return (int)a;
	}
	
	
}