package com.question3;



public class Student {

	int roll;
	String name;
	String address;
	String collegeName;
	
	//-------------------------------Constructor create----------------------------------------
	
	public Student() {
		
	}
	
	 public Object Student(int roll1,String name1 ,String address1){
		
		roll= roll1;
		name= name1;
		address= address1;
		collegeName="NIT";
		return this;
	}
	
	public Object Student(int roll1,String name1 ,String address1,String collegeName1){
		
		roll= roll1;
		name= name1;
		address= address1;
		collegeName=collegeName1;
		return this;
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
	
	


	
	public static Student getStudent(boolean isFromNIT) {
		
		if(isFromNIT==true) {
			Student e= new Student();
			Object a= e.Student(6554,"Laxmi","Nanded, Maharastra");
			Student aaaa = Student.class.cast(a);
			return aaaa;
		}
		else {
			Student e= new Student();
			Object a= e.Student(101,"Sonal Wavale","Pune, Maharastra","COEP");
			Student aaaa = Student.class.cast(a);
			return aaaa;
		}
	}
}


	
	
	

