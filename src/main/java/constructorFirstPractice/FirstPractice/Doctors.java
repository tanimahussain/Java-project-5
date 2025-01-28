package constructorFirstPractice.FirstPractice;

public class Doctors {
	private String name;
	private String address;
	private DoctorsDept dept;
	
	public Doctors(String name, String address, DoctorsDept dept) {
		this.name=name;
		this.address=address;
		this.dept= dept;
		
	}
	
	public String getname() {
		return this.name;
	}
    public void setaddress(String newaddress) {
    	this.address=newaddress;
    }
    public String getaddress() {
    	return this.address;
    }
    public DoctorsDept getdept() {
    	return this.dept;
    }
    public void printdoctorsdetails() {
    	System.out.println(getname());
    	System.out.println(getaddress());
    	dept.printdoctorsdeptdetails();
    	System.out.println(dept.getdeptname());
    }
}
