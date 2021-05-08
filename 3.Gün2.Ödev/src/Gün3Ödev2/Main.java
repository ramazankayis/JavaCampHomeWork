package Gün3Ödev2;

public class Main {

	public static void main(String[] args) {

		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();

		System.out.println("***123******Öğrenciler**123****");
		Student student1 = new Student(1, "Ramazan", "kayış", "00ss00000", "ramazank@gmail.com", "pppppp",
				"87887889898", 2);
		Student student2 = new Student(2, "rümeysa", "yavaş", "111111", "rümeysay@gmail.com", "oooooo", "12121212121",
				1);
		Student[] students = { student1, student2 };
		studentManager.getAllDetailStudents(students);

		System.out.println("*123****Öğssretmen*****Eğimen*123**");
		Instructor instructor1 = new Instructor(3, "Engin", "Demiroğ", "9999999", "engind@gmail.com",
				"454545454ss54545", 3, 20000);
		Instructor instructor2 = new Instructor(4, "Esra", "Sancak", "88888888", "esras@gmail.com", "969696969699", 6,
				12000);
		Instructor[] instructors = { instructor1, instructor2 };
		instructorManager.getAllDetailsInstructor(instructors);

		System.out.println("");
		System.out.println("     -----UserManager Bölümü-----");
		userManager.addMultiple(instructors);
		userManager.updateMultiple(students);
		userManager.deleteMultiple(instructors);

		System.out.println("");
		System.out.println("     -----StudentManager Bölümü-----");
		studentManager.register(student2);
		studentManager.register(student1);
		studentManager.getAll(students);
		studentManager.login(student1);
		studentManager.exit(student1);
		studentManager.login(student2);
		studentManager.exit(student2);

		System.out.println("");
		System.out.println("     -----InstructorManager Bölümü-----");
		instructorManager.getAll(instructors);
		instructorManager.login(instructor1);
		instructorManager.login(instructor2);
		instructorManager.exit(instructor1);
		instructorManager.exit(instructor2);

	}

}
