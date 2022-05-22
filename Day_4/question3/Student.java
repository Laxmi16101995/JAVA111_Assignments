package com.question3;

public class Student {

	int roll;
	String name;
	String address;
	String collegeName;
	
	//-------------------------------Constructor create----------------------------------------
	
	public Student() {
		
	}
	
	 public Student(int roll1,String name1 ,String address1){
		
		roll= roll1;
		name= name1;
		address= address1;
		collegeName="NIT";
		
	}
	
	public Student(int roll1,String name1 ,String address1,String collegeName1){
		
		roll= roll1;
		name= name1;
		address= address1;
		collegeName=collegeName1;
		
	}
	
	//-----------------------Getter Setter Methods-------------------------------------
	
	public void setRollNumber(int rollNum) {
		roll=rollNum;
	}
	public int getRollNumber() {
		return roll;
	}
	
	
	public void setName(String name1) {
		name=name1;
	}
	public String getName() {
		return name;
	}
	
	
	public void setAddress(String address1) {
		address=address1;
	}
	public String getAddress() {
		return address;
	}
	
	
	public void setcollageName(String collageName1) {
		collegeName=collageName1;
	}
	public String getcollageName() {
		return collegeName;
	}
	
	//----------------------------Show details obj------------------------------------------
	
	
	
	public void showObject() {
			
			System.out.println("Roll Number is: "+roll);
			System.out.println("Name is: "+name);
			System.out.println("Age is: "+address);
			System.out.println("Marks are: "+collegeName);
	}

	
	public static void getStudent(boolean isFromNIT) {
		
		if(isFromNIT==true) {
			Student s= new Student(10,"Laxmi Wavale","Nanded, Maharashtra");
			s.showObject();
		}else {
			Student s= new Student(10,"Sonal","Pune, Mahatastra","COEP");
			s.showObject();
		}
	}
}


	
	
	

