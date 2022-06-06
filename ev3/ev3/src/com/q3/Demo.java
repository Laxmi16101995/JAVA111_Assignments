package com.q3;

import java.util.Scanner;

public class Demo {

	void showDetails(Month m) {
		
		switch (m) {
		case JAN:
			System.out.println("“This is the 1st Month of the Year January”");
			break;
		case FEB:
			System.out.println("“This is the 2st Month of the Year february”");
			break;
		case MARCH:
			System.out.println("“This is the 3rd Month of the Year march”");
			break;
		case APR:
			System.out.println("“This is the 4th Month of the Year april”");
			break;
		case MAY:
			System.out.println("“This is the 5th Month of the Year May”");
			break;
		case JUN:
			System.out.println("“This is the 6th Month of the Year June”");
			break;
		case JUL:
			System.out.println("“This is the 7th Month of the Year July”");
			break;
		case AUG:
			System.out.println("“This is the 8th Month of the Year Agust”");
			break;
		case SEP:
			System.out.println("“This is the 9th Month of the Year september”");
			break;
		case OCT:
			System.out.println("“This is the 10th Month of the Year octomber”");
			break;
		case NOV:
			System.out.println("“This is the 11th Month of the Year November”");
			break;
		case DEC:
			System.out.println("“This is the 12th Month of the Year December”");
			break;
		default:
			break;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter month");
		String mon= sc.next();
		try {
			
			Month m= Month.valueOf(mon);
			
			Demo d= new Demo();
			d.showDetails(m);
		}catch(IllegalArgumentException a) {
			System.out.println("Invalid Month Name");
		}
	}
}
