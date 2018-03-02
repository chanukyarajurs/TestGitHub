package school.omega;
import school.omega.Teacher;
public class PhysicsTeacher extends Teacher {
	String subject;
	public PhysicsTeacher(){
		System.out.println("Inside PhysicsTeacher Constructor");
	};
	public PhysicsTeacher(String sTeacherName){
		this.name = sTeacherName;
	}
	
	
	public void PhysicsExperiments(){
		System.out.println("Conducts physics experiments");
	}
}
