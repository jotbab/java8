package sec6;

public class Student {

	private String studentNum;
	
	public Student(String studentNum){
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}

	@Override
	public boolean equals(Object arg0) {
		
		return super.equals(arg0);
	}

	@Override
	public int hashCode() {
		
		return super.hashCode();
	}
	
}
