import java.util.ArrayList;

public class Instructor extends Person{

	private String extraInfo;
	private String status;
	private ArrayList<String> qualifications = new ArrayList<String>();
	private ArrayList<Course> pastCourses = new ArrayList<Course>();
	private ArrayList<Course> currentCourses = new ArrayList<Course>();
	
	
	//Constructors
	public Instructor(String...strings){
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
	
	public Instructor(String id, 
				String n, 
				String num, 
				String add, 
				String info, 
				String stat){
		setUUID(id);
		setName(n);
		setPhoneNumber(num);
		setAddress(add);
		setExtraInfo(info);
		setStatus(stat);
	}
	
	//Methods	
	public void addCurrentCourse(Course c){
		currentCourses.add(c);
	}
	
	public void removeCurrentCourse(Course c){
		currentCourses.remove(c);
	}
	
	public int countCurrentCourses(){
		return currentCourses.size();
	}
	
	public void addPastCourse(Course c){
		pastCourses.add(c);
	}
	
	public void removePastCourse(Course c){
		pastCourses.remove(c);
	}
	
	public int countPastCourses(){
		return pastCourses.size();
	}
	
	public void addQualification(String s){
		qualifications.add(s);
	}
	
	public void removeQualification(String s){
		qualifications.remove(s);
	}

	public String getExtraInfo() {
		return extraInfo;
	}

	public void setExtraInfo(String extraInfo) {
		this.extraInfo = extraInfo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
