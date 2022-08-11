package oo.composicao;

public class CourseTest {
	public static void main(String[] args) {
		
		//Instances
		Student s1 = new Student("Nicolas");
		Student s2 = new Student("Helo");
		Student s3 = new Student("Borba");
		
		Course c1 = new Course("POO");
		Course c2 = new Course("Banco de dados");
		Course c3 = new Course("AED2");
		
		//Relations
		c1.addStudent(s1);
		c1.addStudent(s2);
		
		c2.addStudent(s1);
		c2.addStudent(s3);
		
		s1.addCourse(c3);
		s2.addCourse(c3);
		s3.addCourse(c3);
		
		//Saidas
		for(Student student : c3.students) {
			System.out.printf("O aluno %s está matriculado no curso de %s.\n",
					student.name, c3.name);
		}
		System.out.printf("\n");
		
		System.out.println(s1.courses.get(0).students);
		System.out.println(c1.students);
		
		//Find course by name
		Course courseFounded = s1.getCursoByName("AED2");
		if(courseFounded != null) {
			System.out.println("\nCurso encontrado: \n" 
					+ courseFounded.students);
		}
	}
}
