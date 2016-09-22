import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class CMS_IMP {
	
	static StatTracker tracker = new StatTracker();
	
	static ArrayList<String> filenames = new ArrayList<String>();
	static ArrayList<Scanner> scanners = new ArrayList<Scanner>();
	
	static ArrayList<Student> students = new ArrayList<Student>();
	static ArrayList<Instructor> instructors = new ArrayList<Instructor>();
	static ArrayList<Course> courses = new ArrayList<Course>();
	static ArrayList<Record> records = new ArrayList<Record>();

	
	
	public static void main(String[] args) {
		
		filenames.add("students.csv");
		filenames.add("instructors.csv");
		filenames.add("courses.csv");
		filenames.add("records.csv");
		
		//Read information from files and handle according to what 
		//type of input it is.
		String[] tokens;
		for (int i=0; i<filenames.size(); i++){
			
			try {
				scanners.add(new Scanner(new File(filenames.get(i))));
				scanners.get(i).useDelimiter(",");
				
				while (scanners.get(i).hasNextLine()){
					tokens = scanners.get(i).nextLine().split(",");
					
					//populate the appropriate list according to type while
					//keeping track of counts in tracker object.
					handleFileInput(tokens,i);
				}
				scanners.get(i).close();
				
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}	
		
		//Find all students that have not taken any classes
		findStudentStats();
		
		//Find all courses that haven't been taken by any students
		//and the count for each semester.
		findCourseStats();
		
		//Find all instructors who haven't taught any classes
		findInstructorStats();
		
		//Print to the console in digest format
		tracker.printDigestFormat();
	}
	
	//Helper Methods
	
	static void handleFileInput(String[] tokens, int i){
		
		Student foundStudent = new Student();
		Course foundCourse = new Course();
		Instructor foundInstructor = new Instructor();
		
		
		switch (i){
			//students
			case 0: 
				Student saveStudent = new Student(tokens);
				students.add(saveStudent);
					
				//Update the statistics tracker
				tracker.setStudentCt(tracker.getStudentCt()+1);
				break;
			//instructors
			case 1: 
				Instructor saveInst = new Instructor(tokens);
				instructors.add(saveInst);
				
				//Update the statistics tracker
				tracker.setInstructorCt(tracker.getInstructorCt()+1);
				break;
			//courses
			case 2: 
				Course saveCourse = new Course(tokens);
				courses.add(saveCourse);
					
				//Update the statistics tracker
				tracker.setCourseCt(tracker.getCourseCt()+1);
				break;
			//records
			case 3: 
				foundStudent = findStudent(foundStudent,tokens);
				foundCourse = findCourse(foundCourse,tokens);
				foundInstructor = findInstructor(foundInstructor,tokens);
				
				
				Record saveRecord = new Record(foundCourse,
						foundInstructor,
						tokens[4].charAt(0),
						tokens[3]);
				
				
				foundStudent.addRecord(saveRecord);
				foundStudent.addCurrentCourse(foundCourse);
				foundCourse.addStudent(foundStudent);
				foundCourse.setCurrentInstructor(foundInstructor);
				foundInstructor.addCurrentCourse(foundCourse);
				
				//Update the statistics tracker
				tracker.setRecordCt(tracker.getRecordCt()+1);
				break;
			default:
					break;
		}
	}
	
	// Find the student that was indicated in tokens
	static Student findStudent(Student foundStudent, String[] tokens){
		
		
		for (Student student:students){
			
			if (student.getUUID().equals(tokens[0])){
				foundStudent = student;
				return foundStudent;
			}
			else{
				// TODO return student not found
			}	
		}
		return foundStudent;
		
	}
	
	// Find the course that was indicated in tokens
	static Course findCourse(Course foundCourse, String[] tokens){
		
		for (Course course:courses){
			if (course.getCourseID().equals(tokens[1])){
				foundCourse = course;
				return foundCourse;
			}
			else{
				// TODO return course not found
			}
		}
		return foundCourse;
		
	}
	
	// Find the instructor that was indicated in tokens
	static Instructor findInstructor(Instructor foundInstructor, 
			String[] tokens){
		
		for (Instructor instr:instructors){
			if (instr.getUUID().equals(tokens[2])){
				foundInstructor = instr;
				return foundInstructor;
			}
			else{
				// TODO return instructor not found
			}
		}
		return foundInstructor;
	}
	
	// Find all students that have not taken any classes
	static void findStudentStats(){
		
		for (Student student:students){
			if (!((student.countCurrentCourses() > 0) ||
					(student.countPastCourses() > 0))){
				tracker.setStudentNoClassCt(tracker.getStudentNoClassCt() + 1);
			}
			else{
				
			}
			
		}
		
	}
	
	//  Find all courses that haven't been taken by any students
	//  and the count for each semester.
	static void findCourseStats(){
		
		for (Course course:courses){
			if (course.countStudents() <= 0){
				tracker.setCourseNoStudentCt(tracker.getCourseNoStudentCt()+1);
			}
			
			for (String semester:course.getSemesterList()){
				switch (semester.toLowerCase()){
					case "fall":	
						tracker.setCourseFallCt(tracker.getCourseFallCt()+1);
						break;
					case "spring":
						tracker.setCourseSpringCt(tracker.getCourseSpringCt()+1);
						break;
					case "summer":
						tracker.setCourseSummerCt(tracker.getCourseSummerCt()+1);
						break;
						
				}
			}
		}
		
	}
	
	//  Find all instructors who haven't taught any classes
	static void findInstructorStats(){
		
		for (Instructor inst:instructors){
			if ((inst.countCurrentCourses() <= 0) && 
					(inst.countPastCourses() <= 0)){
				tracker.setInstructorNoTeachCt(tracker.getInstructorNoTeachCt()+1);
			}
		}
		
	}
	
}
