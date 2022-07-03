package com.createiq.demo;

import java.beans.PropertyVetoException;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;



public class DatasourceDemo {
	public static void main(String[] args) {
		
<<<<<<< Upstream, based on branch 'master' of https://github.com/vidvaan/Nov-2021.git
		System.out.println("<============== Basic Data Source ===============>");
		System.out.println("<============== Test Data Source ===============>");
		System.out.println("<============== Test Data Source ===============>");
		System.out.println("<============== Test Data Source ===============>");
=======
		//System.out.println("<============== Basic Data Source ===============>");
		System.out.println("<============== Basic Data Source Test ===============>");
>>>>>>> bbb7940 Test Changes
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/emedico");
		ds.setUsername("root");
		ds.setPassword("root");
		try {
			System.out.println("Connection : "+ds.getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("<============== Combo pool Data source ===============>");
		
		ComboPooledDataSource c3ds  = new ComboPooledDataSource();
		try {
			c3ds.setDriverClass("com.mysql.cj.jdbc.Driver");
			c3ds.setJdbcUrl("jdbc:mysql://localhost:3306/emedico");
			c3ds.setUser("root");
			c3ds.setPassword("root");
			System.out.println(c3ds.getConnection());
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
