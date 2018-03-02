package school.omega;

public class Teacher {
	String designation;
	String CollageName;
	String name;
	public static int TeacherCount;
	public Teacher(){
		name="Name not entered";
		designation = "Enter Designation";
		CollageName = "Enter CollageName";
		TeacherCount = TeacherCount + 1;
		System.out.println("Inside Teacher Class Constructor");
	};
	
	public Teacher(String sTeacherName){
		this.name=sTeacherName;
		designation = "Enter Designation";
		CollageName = "Enter CollageName";
		TeacherCount = TeacherCount + 1;
		System.out.println("Inside Teacher Class Constructor with Parameter");
	}
	
	public void Teaching(){
		System.out.println("Teaching");
	}
	
	//accessors
	public String getname(){
		return name;
	}
	public void setname(String name){
		this.name=name;
	}
	

	
	
	
}
