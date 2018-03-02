package training;
import school.omega.PhysicsTeacher;
import school.omega.Teacher;
public class Training {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhysicsTeacher physicsTeacher = new PhysicsTeacher();
		PhysicsTeacher pt = new PhysicsTeacher("Sreeni");

		System.out.println(pt.getname());
		System.out.println("Total No of Teachers : "+ Teacher.TeacherCount);
		
	}

}
