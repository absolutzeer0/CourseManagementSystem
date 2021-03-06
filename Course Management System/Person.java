/**
 * 
 */

/**
 * @author Matthew McDermott
 *
 */
public abstract class Person {
	
	//Class members
	protected String UUID;
	protected String name;
	protected int phoneNumber;
	protected String address;
	
	//Getters and Setters
	protected String getUUID(){
		return UUID;
	}
	
	protected void setUUID(String id){
		this.UUID = id;
	}
	
	protected String getName(){
		return name;
	}
	
	protected void setName(String n){
		this.name = n;
	}
	
	protected int getPhoneNumber(){
		return phoneNumber;
	}
	
	protected  void setPhoneNumber(int n){
		this.phoneNumber = n;
	}
	
	protected String getAddress(){
		return address;
	}
	
	protected void setAddress(String a){
		this.address = a;
	}
}
