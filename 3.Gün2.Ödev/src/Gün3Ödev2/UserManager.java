package Gün3Ödev2;

public class UserManager {

	public void add(User user) {
		System.out.println("Kullanıcı eklendi");
	}

	public void addMultiple(User[] users) {

		for (User user : users) {
			add(user);
		}
	}

	public void update(User user) {

		System.out.println("kullanıcı güncellendi");
	}

	public void updateMultiple(User[] users) {
		for (User user : users) {
			update(user);
		}
	}

	public void delete(User user) {
		System.out.println("kullanıcı  silindi.");
	}

	public void deleteMultiple(User[] users) {
		for (User user : users) {
			delete(user);
		}
	}
}
