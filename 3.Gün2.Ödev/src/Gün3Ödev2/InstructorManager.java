package Gün3Ödev2;

public class InstructorManager extends UserManager {

	public void getAll(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			System.out.println("Tüm eğitmenler listele==> " + instructor.getFirstName() + instructor.getLastName());
		}
	}

	public void login(Instructor instructor) {
		System.out.println("Giriþ yapıldı. -> " + instructor.getFirstName());
	}

	public void exit(Instructor instructor) {
		System.out.println("Çıkış yapıldı. -> " + instructor.getFirstName());
	}

	public void getAllDetailsInstructor(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			System.out.println(" **********************************");
			System.out.println("isim: " + instructor.getFirstName());
			System.out.println("Soyisim: " + instructor.getLastName());
			System.out.println("Tc No: " + instructor.getIdentityNumber());
			System.out.println("Email: " + instructor.getEmail());
			System.out.println("Þifre: " + instructor.getPassword());
			System.out.println("Öğrenci sayısı: " + instructor.getStudentCount());
			System.out.println("Maaş: " + instructor.getSalary());

		}
	}
}
