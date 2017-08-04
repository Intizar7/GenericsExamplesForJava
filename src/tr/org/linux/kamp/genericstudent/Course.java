package tr.org.linux.kamp.genericstudent;

import java.util.ArrayList;

public class Course {
	private String name;
	private String Department;
	private String lecturer;
	
	private ArrayList<Student> registeredStudents=new ArrayList<>();
	
	public Course(String name, String department, String lecturer) {
		super();
		this.name = name;
		Department = department;
		this.lecturer = lecturer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getLecturerName() {
		return lecturer;
	}
	public void setLecturerName(String lecturer) {
		this.lecturer = lecturer;
	}
	
	public void registerToCourse(Student student) {
		registeredStudents.add(student);
	}
	
	@Override
	public String toString() {
		return "Course [name=" + name + ", Department=" + Department + ", lecturer=" + lecturer
				+ ", registeredStudents=" + registeredStudents + "]";
	}
	public ArrayList<Student> getRegisteredStudents() {
		return registeredStudents;
	}
	public void setRegisteredStudents(ArrayList<Student> registeredStudents) {
		this.registeredStudents = registeredStudents;
	}

}
