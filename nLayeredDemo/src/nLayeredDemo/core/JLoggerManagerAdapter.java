package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {

	@Override
	public void logToSystem(String message) {
		// TODO Auto-generated method stub
		
		JLoggerManager jLoggerManager = new JLoggerManager();
		jLoggerManager.log(message);
	}

}
