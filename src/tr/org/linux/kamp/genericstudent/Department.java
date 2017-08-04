package tr.org.linux.kamp.genericstudent;

import java.util.HashMap;

public class Department {
	
	private String departmentName;
	private String facultyName;
	private HashMap<String, Student> studentList=new HashMap<>();
	public Department(String departmentName, String facultyName) {
		super();
		this.departmentName = departmentName;
		this.facultyName = facultyName;
		
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public HashMap<String, Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(HashMap<String, Student> studentList) {
		this.studentList = studentList;
	}
	
	
	public void AddStudent(Student student) {
		studentList.put(student.getId(), student);
	}
	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", facultyName=" + facultyName + ", studentList="
				+ studentList + "]";
	}
	
}
