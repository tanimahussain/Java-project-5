package constructorFirstPractice.FirstPractice;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    	
    	DoctorsDept[] Dept= {new DoctorsDept("Cardiology",101),new DoctorsDept("neurology",102)};
       Doctors doctor1= new Doctors("Lina","NY",Dept);
       Doctors doctor2=new Doctors("Tania","Maine",Dept);
       
       doctor1.setaddress("Texas");
       System.out.println(doctor1.getaddress());
       System.out.println(doctor2.getname());
       
       System.out.println("Doctor1: "+doctor1.getdept()[0].getdeptname()+" ,roomnumber: "+ doctor1.getdept()[0].getroomnumber());
       
      // for(int i=0;i<doctor1.length();i++) {
    	//   System.out.println(doctor1.charAt(i));
      // }
    }
}
