import java.util.ArrayList;

public class Record {

	//class members
	private char letterGrade;
	private String instructorComments;
	private boolean isCurrentRecord;
	
	//Constructor
	public Record(char grade, String comments, boolean isCurrent){
		setLetterGrade(grade);
		setInstructorComments(comments);
		setCurrentRecord(isCurrent);
	}
	
	
	//Getters and Setters
	public char getLetterGrade() {
		return letterGrade;
	}

	public void setLetterGrade(char letterGrade) {
		this.letterGrade = letterGrade;
	}

	public String getInstructorComments() {
		return instructorComments;
	}

	public void setInstructorComments(String instructorComments) {
		this.instructorComments = instructorComments;
	}

	public boolean isCurrentRecord() {
		return isCurrentRecord;
	}

	public void setCurrentRecord(boolean isCurrentRecord) {
		this.isCurrentRecord = isCurrentRecord;
	}
	
}
