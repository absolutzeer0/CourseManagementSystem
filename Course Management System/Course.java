import java.util.ArrayList;
import java.util.List;

public class Course {

	//class members
	private int courseID;
	private String title;
	private String description;
	private ArrayList<String> semesterList = new ArrayList<String>();
	private Instructor currentInstructor;
	private ArrayList<Instructor> pastInstructors = new ArrayList<Instructor>();
	private int numSeats;
	private ArrayList<Student> enrolledStudents = new ArrayList<Student>();
	
	//class methods
	public Course(int id, 
			String t, 
			String d,
			Instructor inst, 
			List<Instructor> pastInst, 
			int nSeats, 
			List<Student> eStudents){
		setCourseID(id);
		setTitle(t);
		setDescription(d);
		setNumSeats(nSeats);
		
	}
	
	public void addStudent(Student s){
		enrolledStudents.add(s);
		this.numSeats--;
	}
	
	public void removeStudent(Student s){
		enrolledStudents.remove(s);
		this.numSeats++;
	}
	
	public void addSemester(String s){
		semesterList.add(s);
	}
	
	public void removeSemester(String s){
		semesterList.remove(s);
	}
	
	public void addPastInstructor(Instructor i){
		pastInstructors.add(i);
	}
	
	public void removePastInstructor(Instructor i){
		pastInstructors.remove(i);
	}

	
	//Getters and setters
	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Instructor getCurrentInstructor() {
		return currentInstructor;
	}

	public void setCurrentInstructor(Instructor currentInstructor) {
		this.currentInstructor = currentInstructor;
	}

	public int getNumSeats() {
		return numSeats;
	}

	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}
		
}
