import java.util.ArrayList;

public class Student extends Person{
	
	private Counselor counselor;
	private Program program;
	private ArrayList<Course> currentCourses = new ArrayList<Course>();
 	private ArrayList<Course> pastCourses = new ArrayList<Course>();
 	private ArrayList<Record> records = new ArrayList<Record>();
	
	//Constructor
	public Student(String id, String n, String num, String add){
		setUUID(id);
		setName(n);
		setPhoneNumber(num);
		setAddress(add);
	}
	
	public Student(String...strings){
		if (strings.length == 4){
			setUUID(strings[0]);
			setName(strings[1]);
			setPhoneNumber(strings[3]);
			setAddress(strings[2]);
		}
		else{
			// TODO throw exception
		}
		
	}
	
	public boolean addCurrentCourse(Course c){
		if (this.program.courseList.contains(c)){
			currentCourses.add(c);
			return true;
		}
		else{
			return false;
		}
		
	}
	
	public boolean removeCurrentCourse(Course c){
		if (currentCourses.contains(c)){
			currentCourses.remove(c);
			return true;
		}
		else{
			return false;
		}
	}
	
	public void addPastCourse(Course c){
		pastCourses.add(c);
	}
	
	public boolean removePastCourse(Course c){
		if (this.pastCourses.contains(c)){
			pastCourses.remove(c);
			return true;
		}
		else{
			return false;
		}
	}
	
	public void addRecord(Record r){
		records.add(r);
	}
	
	public boolean removeRecord(Record r){
		if (this.records.contains(r)){
			records.remove(r);
			return true;
		}
		else{
			return false;
		}
	}
	
	
	//Getters and Setters
	public Counselor getCounselor() {
		return counselor;
	}

	public void setCounselor(Counselor counselor) {
		this.counselor = counselor;
	}

	public Program getProgram() {
		return program;
	}

	public void setProgram(Program program) {
		this.program = program;
	}
	
	
	
	
	
	
}
