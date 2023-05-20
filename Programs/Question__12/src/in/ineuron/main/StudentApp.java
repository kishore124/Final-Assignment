package in.ineuron.main;

import java.util.Scanner;

import in.ineuron.dto.Student;
import in.ineuron.service.IStudentService;
import in.ineuron.servicefactory.ServiceFactory;

public class StudentApp {

	private static IStudentService service;
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		while (true) {
			System.out.println("*******************************");
			System.out.println("Enter 1 to perform insert operation");
			System.out.println("Enter 2 to perform select operation");
			System.out.println("Enter 3 to perform update operation");
			System.out.println("Enter 4 to perform delete operation");
			System.out.println("Enter 0 to  exit ");
			int value = scanner.nextInt();

			if (value == 1) {
				insertOperation();

			} else if (value == 2) {
				selectOperation();

			} else if (value == 3) {
				updateOperation();

			} else if (value == 4) {
				deleteOperation();

			} else if (value == 0) {
				System.out.println("*********Thanks For using the service*************");
				break;
			}
		}
	}

	private static void deleteOperation() {

		service = ServiceFactory.getStudentService();

		scanner = new Scanner(System.in);

		System.out.println("Enter ID :");
		String id = scanner.nextLine();

		String status = service.deleteStudentRecord(Integer.parseInt(id));

		if (status.equalsIgnoreCase("success"))
			System.out.println("Record Inserted successful");
		else
			System.out.println("Record Inserted Failed");
	}

	private static void updateOperation() {
		service = ServiceFactory.getStudentService();
		scanner = new Scanner(System.in);

		System.out.println("Enter ID :");
		String id = scanner.nextLine();

		Student std = service.findStudentByID(Integer.parseInt(id));

		if (std != null) {
			Student newStd = new Student();

			newStd.setSid(std.getSid());
			System.out.println("Studnet id " + std.getSid());

			System.out.println("Old Name is :: " + std.getSname() + " Enter new name ");
			String newName = scanner.nextLine();

			if (newName.equals("") || newName == "")
				newStd.setSname(std.getSname());
			else
				newStd.setSname(newName);

			System.out.println("Old Age is :: " + std.getSage() + " Enter new Age ");
			String newAge = scanner.nextLine();

			if (newAge.equals("") || newAge == "")
				newStd.setSage(std.getSage());
			else
				newStd.setSage(Integer.parseInt(newAge));

			System.out.println("Old Address is :: " + std.getSaddress() + " Enter new Address ");
			String newAddress = scanner.nextLine();

			if (newAddress.equals("") || newAddress == "")
				newStd.setSaddress(std.getSaddress());
			else
				newStd.setSaddress(newAddress);

			String status = service.updateStudentData(newStd);
			if (status.equalsIgnoreCase("success"))
				System.out.println("Record Updation successful");
			else
				System.out.println("Record Updation Failed");
		} else {
			System.out.println("No Record is available with this id" + id);
		}
	}

	private static void selectOperation() {

		service = ServiceFactory.getStudentService();

		scanner = new Scanner(System.in);

		System.out.println("Enter ID :");
		String id = scanner.nextLine();
		Student std = service.findStudentByID(Integer.parseInt(id));
		if (std != null) {
			System.out.println("Id\tName\tAge\tAddress");
			System.out.println(std.getSid() + "\t" + std.getSname() + "\t" + std.getSage() + "\t" + std.getSaddress());
		} else {
			System.out.println("No record found of id  " + id);
		}

	}

	private static void insertOperation() {

		service = ServiceFactory.getStudentService();

		scanner = new Scanner(System.in);

		System.out.println("Enter Name :");
		String name = scanner.nextLine();

		System.out.println("Enter Age :");
		String age = scanner.nextLine();

		System.out.println("Enter Address: ");
		String address = scanner.nextLine();

		Student student = new Student();
		student.setSname(name);
		student.setSaddress(address);
		student.setSage(Integer.parseInt(age));
		String status = service.insertStundet(student);
		if (status.equalsIgnoreCase("success"))
			System.out.println("Record Inserted successful");
		else
			System.out.println("Record Inserted Failed");

	}

}
