package constructorFirstPractice.FirstPractice;

public class DoctorsDept {
	private String deptname;
	private int roomnumber;
	
	public DoctorsDept(String deptname,int roomnumber) {
		this.deptname=deptname;
		this.roomnumber=roomnumber;
	}

	public String getdeptname() {
		return this.deptname;
	}
	public int getroomnumber() {
		return this.roomnumber;
	}
}
