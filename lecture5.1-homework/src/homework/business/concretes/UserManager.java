package homework.business.concretes;

import java.util.List;
import java.util.function.Predicate;

import homework.business.abstracts.UserActivationService;
import homework.business.abstracts.UserCheckService;
import homework.business.abstracts.UserService;
import homework.business.abstracts.UserValidationService;
import homework.dataAccess.abstracts.UserDao;
import homework.entity.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private UserValidationService userValidationService;
	private UserCheckService userCheckService;

	public UserManager(UserDao userDao, UserValidationService userValidationService,
			UserCheckService userCheckService) {
		this.userDao = userDao;
		this.userValidationService = userValidationService;
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) {
		boolean thrown = false;
		try {
			this.userValidationService.validateForAdd(user);
			this.userCheckService.checkForAdd(user);

		} catch (Exception e) {
			thrown = true;
			e.printStackTrace();
		} finally {

			if (!thrown) {
				this.userDao.add(user);
				System.out.println("User created : " + user.toString());
			}
		}
	}

	@Override
	public void update(User user) {
		try {
			this.userValidationService.validateForAdd(user);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}

		this.userDao.update(user);
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
	}

	@Override
	public User get(Predicate<User> predicate) {
		return this.userDao.get(predicate);
	}

	@Override
	public List<User> getAll() {
		return this.userDao.getAll();
	}

	@Override
	public List<User> getAll(Predicate<User> predicate) {
		return this.userDao.getAll(predicate);
	}

}