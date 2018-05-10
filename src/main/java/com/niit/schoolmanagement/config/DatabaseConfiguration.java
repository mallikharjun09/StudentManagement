package com.niit.schoolmanagement.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfiguration {
	 static Connection connectionObject=null;
     public Connection getConnect(){
    	 try{
    		  String driverName="org.h2.Driver";
    		  String userName="sa";
    		  String password="";
    		  String url="jdbc:h2:tcp://localhost/~/test";
    		  Class.forName(driverName);
    		  connectionObject=DriverManager.getConnection(url,userName,password);
    	      return connectionObject;
    	 }catch(SQLException | ClassNotFoundException exception){
    		 exception.printStackTrace();
    		 return null;
    	 }
     }
}
