package homework;

import homework.business.abstracts.AuthCheckService;
import homework.business.abstracts.AuthService;
import homework.business.abstracts.UserActivationService;
import homework.business.abstracts.UserCheckService;
import homework.business.abstracts.UserService;
import homework.business.abstracts.UserValidationService;
import homework.business.adapters.GoogleSignUpManagerAdapter;
import homework.business.concretes.AuthCheckManager;
import homework.business.concretes.AuthManager;
import homework.business.concretes.UserActivationManager;
import homework.business.concretes.UserCheckManager;
import homework.business.concretes.UserManager;
import homework.business.concretes.UserValidationManager;
import homework.core.utils.sendable.Sendable;
import homework.core.utils.sendable.mail.CustomMailManager;
import homework.core.utils.sendable.mail.MailService;
import homework.core.utils.sendable.sms.CustomSmsManager;
import homework.core.utils.sendable.sms.SmsService;
import homework.dataAccess.abstracts.UserActivationDao;
import homework.dataAccess.abstracts.UserDao;
import homework.dataAccess.concretes.inMemory.InMemoryUserActivationDao;
import homework.dataAccess.concretes.inMemory.InMemoryUserDao;
import homework.entity.concretes.User;

public class Main {

	public static void main(String[] args) {

		UserDao userDao = new InMemoryUserDao();
		UserValidationService userValidationService = new UserValidationManager();
		UserCheckService userCheckService = new UserCheckManager(userDao);
		UserService userService = new UserManager(userDao, userValidationService, userCheckService);

		UserActivationDao userActivationDao = new InMemoryUserActivationDao();
		MailService mailService = new CustomMailManager();
		SmsService smsService = new CustomSmsManager();
		Sendable[] sendables = { mailService, smsService };
		UserActivationService userActivationService = new UserActivationManager(userService, userActivationDao,
				sendables);

		User user = new User(2, "Ramazan", "KAYIŞ", "ramazan_kayis_19@hotmail.com.tr", "123456", "05442443900");

		AuthCheckService authCheckService = new AuthCheckManager(userService);

		AuthService authService = new AuthManager(authCheckService, new GoogleSignUpManagerAdapter(userService),
				userActivationService);
		authService.register(user);

		userActivationService.check("2e315ebc-a2e1-48db-b250-cf560a845e22");

		authService.login("karcanozbal@outlook.com.tr", "123456");

	}

}