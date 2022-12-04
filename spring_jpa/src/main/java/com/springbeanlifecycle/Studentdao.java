package com.springbeanlifecycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Studentdao {
	private String driver;//="com.mysql.jdbc.Driver";
	private String url;//="jdbc:mysql://localhost:3306/?user=root";
	private String username;//="root";
	private String password;//="Moorthy@8900";


/*public static void main(String[] args) {
		s1.selectAllRows();
	}*/

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public void selectAllRows() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, username, password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("Select *from collection.employee;");
		while(rs.next()) {
			int ENO=rs.getInt(1);
			String NAME=rs.getString(2);
			System.out.println("id is"+ENO+"and name is:"+NAME);
		}
	}
			

}
