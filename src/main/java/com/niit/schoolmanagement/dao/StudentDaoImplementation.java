package com.niit.schoolmanagement.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.niit.schoolmanagement.model.Student;

import junit.runner.ReloadingTestSuiteLoader;

public class StudentDaoImplementation implements StudentDao{
	private PreparedStatement prepareStatement=null;
    private ResultSet resultSet=null;
    private String query="";
	@Override
	public int registerNewStudent(Student student) {
		// TODO Auto-generated method stub
		try{
		   query="insert into student(?,?,?,?,?,?)";
		   prepareStatement=connectionObject.prepareStatement(query);
		   prepareStatement.setInt(1, student.getStudentId());
		   prepareStatement.setString(2, student.getStudentName());
		   prepareStatement.setString(2, student.getStudentMailId());
		   prepareStatement.setString(2, student.getStudentAddress());
		   prepareStatement.setString(2, student.getGender());
		   prepareStatement.setString(2, student.getStudentPassword());
		   return prepareStatement.executeUpdate();
		}catch(SQLException exception){
		   exception.printStackTrace();
		   return 0;
		}
	}

	@Override
	public int deleteStudent(int studentId) {
		// TODO Auto-generated method stub
		try{
			   query="delete student where studentid=?";
			   prepareStatement=connectionObject.prepareStatement(query);
			   prepareStatement.setInt(1, studentId);
			   return prepareStatement.executeUpdate();
			}catch(SQLException exception){
			   exception.printStackTrace();
			   return 0;
			}
		
	}

	@Override
	public int updateStudent(Student student) {
		// TODO Auto-generated method stub
		try{
			   query="insert into student(?,?,?,?,?,?)";
			   prepareStatement=connectionObject.prepareStatement(query);
			   prepareStatement.setInt(1, student.getStudentId());
			   prepareStatement.setString(2, student.getStudentName());
			   prepareStatement.setString(2, student.getStudentMailId());
			   prepareStatement.setString(2, student.getStudentAddress());
			   prepareStatement.setString(2, student.getGender());
			   prepareStatement.setString(2, student.getStudentPassword());
			   return prepareStatement.executeUpdate();
			}catch(SQLException exception){
			   exception.printStackTrace();
			   return 0;
			}
	}

	@Override
	public List<Student> displayAllStudents() {
		// TODO Auto-generated method stub
		List<Student> studentList=new LinkedList<Student>();
		try{
		query="select *from student";
		prepareStatement=connectionObject.prepareStatement(query);
		resultSet=prepareStatement.executeQuery();
		while(resultSet.next()){
			Student newStudent=new Student();
			newStudent.setStudentId(Integer.parseInt(resultSet.getString(1)));
			newStudent.setStudentName(resultSet.getString(2));
			newStudent.setStudentMailId(resultSet.getString(3));
			newStudent.setStudentAddress(resultSet.getString(4));
			newStudent.setGender(resultSet.getString(5));
			newStudent.setStudentPassword(resultSet.getString(6));
			studentList.add(newStudent);
		}
		return studentList;
		}catch(SQLException exception){
			exception.printStackTrace();
			return null;
		}		
	}

	@Override
	public Student displaySingleStudent(int studentId) {
		// TODO Auto-generated method stub
		try{
			   query="select * from student where studentid=?";
			   prepareStatement=connectionObject.prepareStatement(query);
			   prepareStatement.setInt(1, studentId);
			   resultSet=prepareStatement.executeQuery();
			   if(resultSet.next()){
			   Student student=new Student();
			   student.setStudentId(Integer.parseInt(resultSet.getString(1)));
			   student.setStudentName(resultSet.getString(2));
			   student.setStudentMailId(resultSet.getString(3));
			   student.setStudentAddress(resultSet.getString(4));
			   student.setGender(resultSet.getString(5));
			   student.setStudentPassword(resultSet.getString(6));
			   return student;
			   }
			   else
				   return null;
			}catch(SQLException exception){
			   exception.printStackTrace();
			   return null;
			}
		
	}

}
