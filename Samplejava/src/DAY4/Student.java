package DAY4;

public class Student {
	private static Student s1 = new Student();
	
	public static Student getObj() {
		return s1;
	}
	private int sid;
	private String sname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	private Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}

}

