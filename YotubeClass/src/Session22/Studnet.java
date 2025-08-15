package Session22;

public class Studnet {
	private int rollNo;
	private String sname;
	private String course;
	private float fees;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	public Studnet(int rollNo, String sname, String course, float fees) {
		super();
		this.rollNo = rollNo;
		this.sname = sname;
		this.course = course;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Studnet [rollNo=" + rollNo + ", sname=" + sname + ", course=" + course + ", fees=" + fees + "]";
	}
}
