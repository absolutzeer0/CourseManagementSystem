import java.util.ArrayList;

public class Instructor extends Person{

	private String extraInfo;
	private String status;
	private ArrayList<String> qualifications = new ArrayList<String>();
	
	
	//Constructor
	public Instructor(String id, 
				String n, 
				int num, 
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
