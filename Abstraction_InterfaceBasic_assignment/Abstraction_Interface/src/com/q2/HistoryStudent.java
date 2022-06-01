package com.q2;

public class HistoryStudent  extends Student{

	int historyMarks;
	int civicsMarks;
	
	@Override
	int getPercentage() {
		
		int sum= historyMarks+civicsMarks;
		int div=sum/200;
		int per= div*100;
		return per;
	}

	@Override
	public String toString() {
		return "HistoryStudent [historyMarks=" + historyMarks + ", civicsMarks=" + civicsMarks + ", name=" + name
				+ ", address=" + address + ", getPercentage()=" + getPercentage() + "]";
	}

	
	
}
