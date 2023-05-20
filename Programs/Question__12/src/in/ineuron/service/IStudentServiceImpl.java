package in.ineuron.service;

import in.ineuron.dao.IStudentImpl;
import in.ineuron.daoservicefactory.DaoServiceFactory;
import in.ineuron.dto.Student;

public class IStudentServiceImpl implements IStudentService {

	IStudentImpl studentdao = null;

	@Override
	public String insertStundet(Student student) {
		studentdao = DaoServiceFactory.getStudentDao();
		return studentdao.insertStundet(student);
	}

	@Override
	public Student findStudentByID(Integer sid) {
		studentdao = DaoServiceFactory.getStudentDao();
		return studentdao.findStudentByID(sid);
	}

	@Override
	public String updateStudentData(Student student) {
		studentdao = DaoServiceFactory.getStudentDao();
		return studentdao.updateStudentData(student);
	}

	@Override
	public String deleteStudentRecord(Integer sid) {
		studentdao = DaoServiceFactory.getStudentDao();
		return studentdao.deleteStudentRecord(sid);
	}

}
