package in.ineuron.main;

import java.util.List;

import in.ineuron.dto.Student;
import in.ineuron.service.IStudentServiceImpl;

public class StudentApp {

	public static void main(String[] args) {

		IStudentServiceImpl service = new IStudentServiceImpl();
		List<Student> stdlist = service.fetchAllStudentDat();
		if (stdlist == null)
			System.out.println("NO Data Available To Display");
		else
			stdlist.forEach(System.out::println);

	}

}
