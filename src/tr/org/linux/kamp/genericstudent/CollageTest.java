package tr.org.linux.kamp.genericstudent;



public class CollageTest {
	
	public static void main(String[] args) {
		Student student1=new Student("Mark","123456789");
		Student student2=new Student("Ayanna","123456789");
		Student student3=new Student("Nick","123456789");
		Student student4=new Student("Rosa","123456789");
		Student student5=new Student("Tom","123456789");
		
		Department department=new Department("Software", "Engineering");
		Course course=new Course("English", "Software", "Büşra Uman");
		System.out.println(department.toString());
	
		department.AddStudent(student1);
		department.AddStudent(student2);
		department.AddStudent(student3);
		department.AddStudent(student4);
		department.AddStudent(student5);
	
		course.registerToCourse(student1);
		course.registerToCourse(student2);
		course.registerToCourse(student3);
		
		System.out.println(department.toString());
        System.out.println(course.toString());
		
		
	}

}
