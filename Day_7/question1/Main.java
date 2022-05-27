package com.question1;

public class Main {

	public static void main(String[] args) {
		
		Manager man= new Manager();
		System.out.println("--------------------------Manager:");
		System.out.println(man.name="Laxmi");
		System.out.println(man.age= 25);
		System.out.println(man.phoneNumber= "5264533556");
		System.out.println(man.address="Nanded, Maharastra.");
		System.out.println(man.salary=20000.95);
		System.out.println(man.Specialisation="SD");
		System.out.println(man.Department="Income tax");
		
		
		
		Employee em= new Employee();
		System.out.println("--------------------------Employee:");
		System.out.println(em.name="Sonal");
		System.out.println(em.age= 20);
		System.out.println(em.phoneNumber= "52633556");
		System.out.println(em.address="Pune, Maharastra.");
		System.out.println(em.salary=25000.95);
		System.out.println(em.Specialisation="Pilot");
		System.out.println(em.Department="Air Force");
		
	}

}
