/*
 * class description
 * 
 * 
 * it calls functions of DBUtilitySingleton to get connections
 * 
 * 
 * 
 * */



package com.example.singleton;

import java.sql.Connection;
import java.sql.SQLException;

public class TestSingleton {

	
	public static void main(String [] args)
	{
		
		Connection singletonConnection=null;
		Connection singletonThreadSafeConnection=null;
		Connection volatileThreadSafeSingletonConnection=null;
	
			try {
				singletonConnection = DBUtilitySingleton.getSimpleSingletonConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		
			if(singletonConnection!=null)
			{
				System.out.println("connection with Simple Singleton is successfull");
			}
			
			else System.out.println("unsuccessfull! might be bcz of unvalid db credentials, please check");
		
		
			try {
				singletonThreadSafeConnection = DBUtilitySingleton.getThreadSafeSingletonConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(singletonThreadSafeConnection!=null)
			{
				System.out.println("connection with Thread Safe Singleton is successfull");
			}
			
			else System.out.println("unsuccessfull! might be bcz of unvalid db credentials, please check");
		
			try {
				volatileThreadSafeSingletonConnection = DBUtilitySingleton.getThreadSafeVolatileSingletonConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(volatileThreadSafeSingletonConnection!=null)
			{
				System.out.println("connection with Thread Safe Volatile Singleton is successfull");
			}
			
			else System.out.println("unsuccessfull! might be bcz of unvalid db credentials, please check");
		
		
		
		
		

		
	}
}
