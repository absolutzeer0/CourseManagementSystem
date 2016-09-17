import java.util.ArrayList;

public class Counselor extends Person{
	
	ArrayList<Student> studentList = new ArrayList<Student>();

	//constructor
	public Counselor(String id, String n, int num, String add){
		setUUID(id);
		setName(n);
		setPhoneNumber(num);
		setAddress(add);
	}
	
	
	public boolean addProgramToStudent(Student student, Program program){
		if (this.studentList.contains(student)){
			student.setProgram(program);
			return true;
		}
		else{
			return false;
		}
	}
	
	public Program createProgram(Student student, ArrayList<Course> courses){
		
		//Create the program
		Program studentProgram = new Program();
		for (Course course : courses){
			studentProgram.addCourse(course);
		}
		return studentProgram;
	}
	
	public void addStudent(Student s){
		studentList.add(s);
	}
	
	public void removeStudent(Student s){
		studentList.remove(s);
	}
}
