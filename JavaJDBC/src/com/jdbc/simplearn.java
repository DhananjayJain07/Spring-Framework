package com.jdbc;
import java.sql.*;
public class simplearn {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		int rollno= 2;
		String name = "Jane";
		int age =22;
		String sql = "insert into Students(rollno, name, age) "+"values("+ rollno +",'"+ name + "'," + age + ")";
		
		try {
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test","postgres","Asdewq123@");
			Statement st = con.createStatement();
			int m = st.executeUpdate(sql);
			if(m==1) {
				System.out.println("inserted successfully : "+ sql);
			}else
			{
				System.out.println("insertion failed");
			}
		}catch(Exception e) {
			System.out.println(e);		
			
	} finally {
		con.close();
	}
}
}