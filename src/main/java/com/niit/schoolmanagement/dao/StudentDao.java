/*
 * This is Student Dao interface
 * contains Connection Object to connect with the Database
 * Has unimplemented methods
 * methods are used to CRUD operations for student
 */


package com.niit.schoolmanagement.dao;

import java.sql.Connection;
import java.util.List;

import com.niit.schoolmanagement.config.DatabaseConfiguration;
import com.niit.schoolmanagement.model.Student;

public interface StudentDao {
     Connection connectionObject=new DatabaseConfiguration().getConnect();
     public int registerNewStudent(Student student);
     public int deleteStudent(int studentId);
     public List<Student> displayAllStudents();
     public Student displaySingleStudent(int studentId);
	int updateStudent(Student student);
}
