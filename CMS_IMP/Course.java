import java.util.ArrayList;

public class Course {

	//class members
	private String courseID;
	private String title;
	private String description;
	private ArrayList<String> semesterList = new ArrayList<String>();
	private Instructor currentInstructor;
	private ArrayList<Instructor> pastInstructors = new ArrayList<Instructor>();
	private int numSeats;
	private ArrayList<Student> enrolledStudents = new ArrayList<Student>();
	
	
	//Constructors
	public Course(String...strings ){
		if (strings.length == 2){
			setCourseID(strings[0]);
			setTitle(strings[1]);
			return;
		}
		else if(strings.length > 2 && strings.length <= 5){
			setCourseID(strings[0]);
			setTitle(strings[1]);
			for (String semester:strings){
				semesterList.add(semester);
			}
		}
		else{
			// TODO throw exception
		}
		
	}
	
	public Course(String id, 
			String t, 
			int nSeats, 
			String d,
			Instructor inst, 
			ArrayList<Instructor> pastInst, 
			ArrayList<Student> eStudents){
		setCourseID(id);
		setTitle(t);
		setDescription(d);
		setNumSeats(nSeats);
		
	}
	
	//class methods
	public void addStudent(Student s){
		enrolledStudents.add(s);
		this.numSeats--;
	}
	
	public void removeStudent(Student s){
		enrolledStudents.remove(s);
		this.numSeats++;
	}
	
	public int countStudents(){
		return enrolledStudents.size();
	}
	
	public void addSemester(String s){
		semesterList.add(s);
	}
	
	public void removeSemester(String s){
		semesterList.remove(s);
	}
	
	public ArrayList<String> getSemesterList(){
		return semesterList;
	}
	
	public void addPastInstructor(Instructor i){
		pastInstructors.add(i);
	}
	
	public void removePastInstructor(Instructor i){
		pastInstructors.remove(i);
	}
	
	public int countPastInstructors(){
		return pastInstructors.size();
	}

	public ArrayList<Instructor> getPastInstructors(){
		return pastInstructors;
	}
	
	//Getters and setters
	public String getCourseID() {
		return courseID;
	}

	public void setCourseID(String courseID) {
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
