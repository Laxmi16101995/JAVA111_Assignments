package question4;

public class Student {
	
	private int rollNumber;
	private String studentName;
	private int marks;
	
	public Student(){
		
	}
	
	public void setrollNumber(int a){
		rollNumber= a;
	}
	public int getrollNumber(){
		return rollNumber;
	}
	
	
	public void setmarks(int b){
		marks= b;
	}
	public int getmarks(){
		return marks;
	}
	
	
	public void setstudentName(String b){
		studentName= b;
	}
	public String getstudentName(){
		return studentName;
	}
	
	public void Student(int a,int b, String c){
		Student s=new Student();
		s.setrollNumber(a);
		s.setstudentName(c);
		s.setmarks(b);
		
		System.out.println(" studentName: "+s.getstudentName());
		System.out.println(" rollNumber: "+s.getrollNumber());
		System.out.println(" marks: "+s.getmarks());
	}
	
}
