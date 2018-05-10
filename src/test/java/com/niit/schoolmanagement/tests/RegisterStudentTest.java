package com.niit.schoolmanagement.tests;

import com.niit.schoolmanagement.dao.StudentDao;
import com.niit.schoolmanagement.dao.StudentDaoImplementation;
import com.niit.schoolmanagement.model.Student;

import junit.framework.TestCase;

public class RegisterStudentTest extends TestCase {
	StudentDao studentDao=new StudentDaoImplementation();
    public void registerNewStudentPossitiveTest(){
    	Student student=new Student();
    	student.setStudentId(101);
    	student.setStudentName("John");
    	student.setStudentMailId("John123@gmail.com");
    	student.setStudentAddress("vellore");
    	student.setGender("male");
    	student.setStudentPassword("john@123");
    	assertEquals("Successfully inserted", 1, studentDao.registerNewStudent(student));
    }
    public void registerNewStudentNegativeTest(){
    	Student student=new Student();
    	student.setStudentId(101);
    	student.setStudentName("Veera venkata satyanarayana vara prasad");
    	student.setStudentMailId("John123@gmail.com");
    	student.setStudentAddress("vellore");
    	student.setGender("male");
    	student.setStudentPassword("john@123");
    	assertEquals("Successfully inserted", 0, studentDao.registerNewStudent(student));
    }
}
