import java.util.ArrayList;

public class Catalog {
	
	//Class members
	private ArrayList<Course> courseList = new ArrayList<Course>();
	
	//Constructor
	public Catalog(){
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
