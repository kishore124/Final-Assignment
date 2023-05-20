package in.ineuron.daoservicefactory;

import in.ineuron.dao.IStudentImpl;

public class DaoServiceFactory {

	private static IStudentImpl studentdao;

	private DaoServiceFactory() {
	}

	public static IStudentImpl getStudentDao() {
		if (studentdao == null)
			studentdao = new IStudentImpl();
		return studentdao;
	}
}
