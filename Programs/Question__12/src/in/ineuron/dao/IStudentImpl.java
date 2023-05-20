package in.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.ineuron.dto.Student;
import in.ineuron.util.JdbcUtil;

public class IStudentImpl implements IStudent {

	private Connection connection;
	private PreparedStatement pstmt;
	private ResultSet resultSet;

	@Override
	public String insertStundet(Student student) {
		String status = null;
		int rowAffected = 0;
		try {
			connection = JdbcUtil.getConnection();

			if (connection != null) {
				String insertQuery = "insert into student (sname,sage,saddress) values(?,?,?)";
				pstmt = connection.prepareStatement(insertQuery);
			}

			if (pstmt != null) {
				pstmt.setString(1, student.getSname());
				pstmt.setInt(2, student.getSage());
				pstmt.setString(3, student.getSaddress());
				rowAffected = pstmt.executeUpdate();
			}

			if (rowAffected == 1)
				status = "success";
			else
				status = "failure";

		} catch (

		SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Student findStudentByID(Integer sid) {

		Student student = null;
		try {
			connection = JdbcUtil.getConnection();
			if (connection != null) {
				String selectQuery = "SELECT sid,sname,sage,saddress FROM student where sid=?;";
				pstmt = connection.prepareStatement(selectQuery);
			}

			if (pstmt != null) {
				pstmt.setInt(1, sid);
				resultSet = pstmt.executeQuery();
			}

			if (resultSet != null) {
				if (resultSet.next()) {
					student = new Student();
					student.setSid(resultSet.getInt(1));
					student.setSname(resultSet.getString(2));
					student.setSage(resultSet.getInt(3));
					student.setSaddress(resultSet.getString(4));

				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return student;
	}

	@Override
	public String updateStudentData(Student student) {
		String status = null;
		int rowAffected = 0;
		try {
			connection = JdbcUtil.getConnection();

			if (connection != null) {
				String insertQuery = "update student set sname=?,sage=?,saddress=? where sid=?";
				pstmt = connection.prepareStatement(insertQuery);
			}

			if (pstmt != null) {
				pstmt.setString(1, student.getSname());
				pstmt.setInt(2, student.getSage());
				pstmt.setString(3, student.getSaddress());
				pstmt.setInt(4, student.getSid());
				rowAffected = pstmt.executeUpdate();
			}

			if (rowAffected == 1)
				status = "success";
			else
				status = "failure";

		} catch (

		SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public String deleteStudentRecord(Integer sid) {
		int rowAffected = 0;
		String status = null;
		try {
			connection = JdbcUtil.getConnection();

			if (connection != null) {
				String insertQuery = "Delete from student where sid=?";
				pstmt = connection.prepareStatement(insertQuery);
			}

			if (pstmt != null) {
				pstmt.setInt(1, sid);
				rowAffected = pstmt.executeUpdate();
			}

			if (rowAffected == 1)
				status = "success";
			else
				status = "failure";

		} catch (

		SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
