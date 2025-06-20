package DAY6;

public class Student{
	private String Sname;
	private static int id;
	private static int reg;
	public Student() {
		id++;
		reg++;
		System.out.println("constructor called...");
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Student.id = id;
	}
	public static int getReg() {
		return reg;
	}
	public static void setReg(int reg) {
		Student.reg = reg;
	}
	@Override
	public String toString() {
		return "Student [id:" +id+" reg: " +reg+" Sname=" + Sname + "]";
	}
	
}