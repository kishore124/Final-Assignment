package in.ineuron.dao;

import in.ineuron.dto.Student;

public interface IStudent {

	public String insertStundet(Student student);
	public Student findStudentByID(Integer sid);
	public String updateStudentData(Student student);
	public String deleteStudentRecord(Integer sid);
}
