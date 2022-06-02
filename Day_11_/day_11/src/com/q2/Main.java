package com.q2;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Mobile m= new Mobile();
		
		m.searchOutdatedModel("Apple", "note4","note5","note6","note7");
		
		
	}
}


class Mobile{
	
	String[] outdatedModels = {"note4","note5","note6","note7"};
	
	void searchOutdatedModel(String company, String... model) {
		Mobile m= new Mobile();
		
		for(int i=0; i<m.outdatedModels.length;i++) {
			
			for(String str:model) {
				
				if(m.outdatedModels[i].equals(str)) {
					System.out.println(str+"_OUTDATED");
				}
				
			}
		}
		
	}
}
