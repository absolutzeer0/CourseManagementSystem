import java.util.ArrayList;

public class Program {
	
	//Class members
	public ArrayList<Course> courseList = new ArrayList<Course>();
	
	//Constructor
	public Program(){
		//empty
	}
	
	//Class methods
	public void addCourse(Course c){
		courseList.add(c);
	}
	
	public void removeCourse(Course c){
		courseList.remove(c);
	}
	
}
