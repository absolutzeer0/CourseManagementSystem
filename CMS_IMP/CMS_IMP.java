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
		Student foundStudent = new Student();
		Course foundCourse = new Course();
		Instructor foundInstructor = new Instructor();
		
		/**
		 * Read information from files and handle according to what 
		 * type of input it is.
		 */
		String[] tokens;
		for (int i=0; i<filenames.size(); i++){
			
			try {
				scanners.add(new Scanner(new File(filenames.get(i))));
				scanners.get(i).useDelimiter(",");
				
				while (scanners.get(i).hasNextLine()){
					tokens = scanners.get(i).nextLine().split(",");
					
					//populate the appropriate list according to type
					switch (i){
						//students
						case 0: Student saveStudent = new Student(tokens);
								students.add(saveStudent);
								
								//Update the statistics tracker
								tracker.setStudentCt(tracker.getStudentCt()+1);
								break;
						//instructors
						case 1: Instructor saveInst = new Instructor(tokens);
								instructors.add(saveInst);
								
								//Update the statistics tracker
								tracker.setInstructorCt(tracker.getInstructorCt()+1);
								break;
						//courses
						case 2: Course saveCourse = new Course(tokens);
								courses.add(saveCourse);
								
								//Update the statistics tracker
								tracker.setCourseCt(tracker.getCourseCt()+1);
								break;
						//records
						case 3: for (Student student:students){
									if (student.getUUID().equals(tokens[0])){
										foundStudent = student;
										break;
									}
									else{
										// TODO return student not found
									}	
								}
						
								for (Course course:courses){
									if (course.getCourseID().equals(tokens[1])){
										foundCourse = course;
										break;
									}
									else{
										// TODO return course not found
									}
								}
								
								for (Instructor instr:instructors){
									if (instr.getUUID().equals(tokens[2])){
										foundInstructor = instr;
										break;
									}
									else{
										// TODO return instructor not found
									}
								}
								
								Record saveRecord = new Record(foundCourse,
										foundInstructor,tokens[4].charAt(0),tokens[3]);
								
								foundStudent.addRecord(saveRecord);
								
								//Update the statistics tracker
								tracker.setRecordCt(tracker.getRecordCt()+1);
								break;
						default:
								break;
					}
				}
				scanners.get(i).close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	
	//Helper Methods
}
