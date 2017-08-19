/*
 * class description
 *  
 *  
 *  class contains three different methods to get db connection using singleton pattern
 *  NOTE: these functions need valid db and credentials to get connection
 *  
 * 
 * */




package com.example.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtilitySingleton {

	private volatile static Connection _connection;
	private static Connection connection;
	private static Connection threadSafeConnection;

	
	// gets singleton connection with basic conditions
	
	public static Connection getSimpleSingletonConnection() throws SQLException
	{
		
		if (connection == null || connection.isClosed()) {
		
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			//provide db credentials for this to work
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/reporting155?autoReconnect=true&useUnicode=true&characterEncoding=utf8", "root", "root");
			
		}
		
		return connection; 
	}
	
	//above function has a problem, its not thread safe
	// this function gets singleton connection with thread safe in case of multiple threads 
	
	public static Connection getThreadSafeSingletonConnection() throws SQLException
	{
		
			if (threadSafeConnection == null || threadSafeConnection.isClosed()) {
			
			synchronized (DBUtilitySingleton.class) {
			
					DriverManager.registerDriver(new com.mysql.jdbc.Driver());
					//provide db credentials for this to work
					threadSafeConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/reporting155?autoReconnect=true&useUnicode=true&characterEncoding=utf8", "root", "root");
				
			}
		}
		return threadSafeConnection;
		
	}
	
	//just to make sure that a thread dont get to the object while its initializing,
	// i used volatile object so it can't be cached and the object is directly accessible in the memory
	
	
	public static Connection getThreadSafeVolatileSingletonConnection() throws SQLException {
		if (_connection == null || _connection.isClosed()) {
			
			synchronized (DBUtilitySingleton.class) {
			
					DriverManager.registerDriver(new com.mysql.jdbc.Driver());
					//provide db credentials for this to work
					_connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/reporting155?autoReconnect=true&useUnicode=true&characterEncoding=utf8", "root", "root");
				
			}
			
			
			
		}
		return _connection;
	}

	
	
	
	
	

}
