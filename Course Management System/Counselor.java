
public class Counselor extends Person{

	//constructor
	public Counselor(String id, String n, int num, String add){
		setUUID(id);
		setName(n);
		setPhoneNumber(num);
		setAddress(add);
	}
	
	public Program createProgram(){
		Program studentProgram = new Program();
		
		
		
		return studentProgram;
	}
}
