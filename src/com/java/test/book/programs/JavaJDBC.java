package com.java.test.book.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class JavaJDBC {

	public static void main(String[] args) throws ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		try {

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gp", "root", "1234");
			
			PreparedStatement ps= null;
			Statement st = conn.createStatement();

//			String cQuery="create table rrr(id int primary key auto_increment, name varchar(255) not null, city varchar(255) not null)";
//			
			

//			st.executeUpdate(cQuery);

//			
			String iQuery="insert into rrr(name ,city) values(?,?)";
//			
			ps=conn.prepareStatement(iQuery);
			
			ps.setString(1,"Venu");
			ps.setString(2, "Hyderabad");
			
			ps.executeUpdate();
			
//			st.executeUpdate(iQuery);

			String uQuery = "update rrr set name='idrus' where id=1";

			st.executeUpdate(uQuery);

			String sQuery = "select * from rrr";

			ResultSet rs = ps.executeQuery(sQuery);

			while (rs.next()) {
				System.out.print(rs.getInt(1) + "-" + rs.getString(2) + "-" + rs.getString(3));
			}
			
			String  dQuery= "delete  from rrr where id=1";
			
			st.executeUpdate(dQuery);

			rs.close();
			st.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {

		}
	}

}
