package constructorFirstPractice.FirstPractice;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    	
    	DoctorsDept Dept1= new DoctorsDept("Cardiology",101);
    	DoctorsDept Dept2= new DoctorsDept("neurology",102);
       Doctors doctor1= new Doctors("Lina","NY",Dept1);
       Doctors doctor2=new Doctors("Tania","Maine",Dept2);
       
      /* doctor1.setaddress("Texas");
       System.out.println(doctor1.getaddress());
       System.out.println(doctor2.getname());
       
       System.out.println("Doctor1: "+doctor1.getdept()[0].getdeptname()+" ,roomnumber: "+ doctor1.getdept()[0].getroomnumber());*/
       
      doctor1.printdoctorsdetails();
      doctor2.printdoctorsdetails();
      
     
    }
}
