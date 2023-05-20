package in.ineuron.servicefactory;

import in.ineuron.service.IStudentService;
import in.ineuron.service.IStudentServiceImpl;

public class ServiceFactory {

	private static IStudentService studentService;

	private ServiceFactory() {
	}

	public static IStudentService getStudentService() {
		if (studentService == null)
			studentService = new IStudentServiceImpl();
		return studentService;
	}

}
