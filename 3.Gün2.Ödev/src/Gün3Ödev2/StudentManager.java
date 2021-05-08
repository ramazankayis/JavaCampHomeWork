package Gün3Ödev2;

public class StudentManager extends UserManager{

	public void getAll(Student[] students) {
		for (Student student : students) {
			System.out.println("Tüm öğrenciler listelendi. -> " + student.getFirstName());
		}
	}

	public void register(Student student) {
		System.out.println("Kayit yapıldı -> " + student.getFirstName());
	}

	public void login(Student student) {
		System.out.println("Giriş yapıldı -> " + student.getFirstName());
	}

	public void exit(Student student) {
		System.out.println("Çıkış yapıldı -> " + student.getFirstName());
	}

	public void getAllDetailStudents(Student[] students) {
		for (Student student : students) {
			System.out.println(" ********************************** ");
			System.out.println("isim: " + student.getFirstName());
			System.out.println("Soyisim: " + student.getLastName());
			System.out.println("Tc No: " + student.getIdentityNumber());
			System.out.println("E-mail: " + student.getEmail());
			System.out.println("şifre: " + student.getPassword());
			System.out.println("Öðrenci No: " + student.getStudentNumber());
			System.out.println("Kurs sayısı: " + student.getCourseCount());
			System.out.println(" ********************************** ");

		}
	}
}
