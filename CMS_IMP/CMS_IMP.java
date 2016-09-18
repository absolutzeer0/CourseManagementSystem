import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class CMS_IMP {

	public static void main(String[] args) {
		
		ArrayList<String> filenames = new ArrayList<String>();
		ArrayList<Scanner> scanners = new ArrayList<Scanner>();
		filenames.add("students.csv");
		filenames.add("instructors.csv");
		filenames.add("courses.csv");
		filenames.add("records.csv");
		
		ArrayList<Student> students = new ArrayList<Student>();
		ArrayList<Instructor> instructors = new ArrayList<Instructor>();
		ArrayList<Course> courses = new ArrayList<Course>();
		ArrayList<Record> records = new ArrayList<Record>();
		
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
								break;
						//instructors
						case 1: Instructor saveInst = new Instructor(tokens);
								instructors.add(saveInst);
								break;
						//courses
						case 2: Course saveCourse = new Course(tokens);
								courses.add(saveCourse);
								break;
						//records
						case 3: for (Student student:students){
									if (student.getUUID() == tokens[0]){
										Student foundStudent = student;
										break;
									}
									else{
										// TODO return student not found
									}	
								}
						
								for (Course course:courses){
									if (course.getCourseID() == tokens[1]){
										Course foundcourse = course;
										break;
									}
									else{
										// TODO return course not found
									}
								}
								
								for (Instructor instr:instructors){
									if (instr.getUUID() == tokens[2]){
										Instructor foundInstructor = instr;
									}
									else{
										// TODO return instructor not found
									}
								}
								
								Record saveRecord = new Record(foundCourse,);
								
								break;
						default:
								break;
					}
					System.out.println(tokens[0]);
					System.out.println(tokens[1]);
					System.out.println(tokens[2]);
					
				}
				scanners.get(i).close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	
		
		
		

	}

}
