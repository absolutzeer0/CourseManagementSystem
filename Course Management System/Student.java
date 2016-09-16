
public class Student extends Person{
	
	private Counselor counselor;
	private Program program;
	
	//Constructor
	public Student(String id, String n, int num, String add){
		setUUID(id);
		setName(n);
		setPhoneNumber(num);
		setAddress(add);
	}
	
	//Create a program for the student 

	
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
