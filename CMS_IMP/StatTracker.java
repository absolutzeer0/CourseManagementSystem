
public class StatTracker {
	/**
	 * Member variables
	 */
	private int recordCt;
	private int studentCt;
	private int studentNoClassCt;
	private int instructorCt;
	private int instructorNoTeachCt;
	private int courseCt;
	private int courseNoStudentCt;
	private int courseFallCt;
	private int courseSpringCt;
	private int courseSummerCt;
	
	
	/**
	 * Constructors
	 */
	public StatTracker(){
		setRecordCt(0);
		setStudentCt(0);
		setStudentNoClassCt(0);
		setInstructorCt(0);
		setInstructorNoTeachCt(0);
		setCourseCt(0);
		setCourseNoStudentCt(0);
		setCourseFallCt(0);
		setCourseSpringCt(0);
		setCourseSummerCt(0);
	}
	
	//Methods
	void printDigestFormat(){
		System.out.println(getRecordCt());
		System.out.println(getStudentCt());
		System.out.println(getStudentNoClassCt());
		System.out.println(getInstructorCt());
		System.out.println(getInstructorNoTeachCt());
		System.out.println(getCourseCt());
		System.out.println(getCourseNoStudentCt());
		System.out.println(getCourseFallCt());
		System.out.println(getCourseSpringCt());
		System.out.println(getCourseSummerCt());
	}
	
	
	//Getters and setters
	public int getRecordCt() {
		return recordCt;
	}
	public void setRecordCt(int recordCt) {
		this.recordCt = recordCt;
	}
	public int getStudentCt() {
		return studentCt;
	}
	public void setStudentCt(int studentCt) {
		this.studentCt = studentCt;
	}
	public int getStudentNoClassCt() {
		return studentNoClassCt;
	}
	public void setStudentNoClassCt(int studentNoClassCt) {
		this.studentNoClassCt = studentNoClassCt;
	}
	public int getInstructorCt() {
		return instructorCt;
	}
	public void setInstructorCt(int instructorCt) {
		this.instructorCt = instructorCt;
	}
	public int getInstructorNoTeachCt() {
		return instructorNoTeachCt;
	}
	public void setInstructorNoTeachCt(int instructorNoTeachCt) {
		this.instructorNoTeachCt = instructorNoTeachCt;
	}
	public int getCourseCt() {
		return courseCt;
	}
	public void setCourseCt(int courseCt) {
		this.courseCt = courseCt;
	}
	public int getCourseNoStudentCt() {
		return courseNoStudentCt;
	}
	public void setCourseNoStudentCt(int courseNoStudentCt) {
		this.courseNoStudentCt = courseNoStudentCt;
	}
	public int getCourseFallCt() {
		return courseFallCt;
	}
	public void setCourseFallCt(int courseFallCt) {
		this.courseFallCt = courseFallCt;
	}
	public int getCourseSpringCt() {
		return courseSpringCt;
	}
	public void setCourseSpringCt(int courseSpringCt) {
		this.courseSpringCt = courseSpringCt;
	}
	public int getCourseSummerCt() {
		return courseSummerCt;
	}
	public void setCourseSummerCt(int courseSummerCt) {
		this.courseSummerCt = courseSummerCt;
	}
	
	
	
	
}
