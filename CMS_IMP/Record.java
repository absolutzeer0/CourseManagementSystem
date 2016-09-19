import java.util.ArrayList;

public class Record {

	//class members
	private char letterGrade;
	private ArrayList<String> instructorComments = new ArrayList<String>();
	private boolean isCurrentRecord;
	private Course course;
	private Instructor instructor;
	
	//Constructors
	public Record(Course course,
					Instructor inst,
					char grade,
					String... comments){
		setCourse(course);
		setInstructor(inst);
		setLetterGrade(grade);
		
		for (String comment:comments){
			addComment(comment);
		}
	}
	
	public Record(Course course, 
					char grade,  
					boolean isCurrent, 
					Instructor inst,
					String...comments){
		setCourse(course);
		setLetterGrade(grade);
		setCurrentRecord(isCurrent);
		setInstructor(inst);
		
		for (String comment:comments){
			addComment(comment);
		}
	}
	
	//Methods
	public void addComment(String comment){
		instructorComments.add(comment);
	}
	
	public boolean removeComment(String comment){
		if (instructorComments.contains(comment)){
			instructorComments.remove(comment);
			return true;
		}
		else{
			return false;
		}
	}
	
	//Getters and Setters
	public char getLetterGrade() {
		return letterGrade;
	}

	public void setLetterGrade(char letterGrade) {
		this.letterGrade = letterGrade;
	}

	public boolean isCurrentRecord() {
		return isCurrentRecord;
	}

	public void setCurrentRecord(boolean isCurrentRecord) {
		this.isCurrentRecord = isCurrentRecord;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}


	public Instructor getInstructor() {
		return instructor;
	}


	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
}
