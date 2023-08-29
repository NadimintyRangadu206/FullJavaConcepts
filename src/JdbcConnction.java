import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.DatabaseMetaData;
import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class JdbcConnction {

	public static void main(String[] args) throws ClassNotFoundException {

		Connection conn = null;
		Statement st = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		java.sql.ResultSetMetaData rsmd=null;
		java.sql.DatabaseMetaData dmd= null;

		String cQuery = "create table General(id int primary key, name varchar(255) not null,city varchar(244) null)";
	
		String iQuery="insert into general(id,name,city) values(?,?,?);";
		
		String uQuery="Update general set name=? where id=?";
		
		String rQuery="Select * from general";
		
		String dQuery="delete from general where id=?";
		
		

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/GP", "root", "1234");
 
			dmd=conn.getMetaData();
			
			System.out.println(dmd.getDriverName()+"-"+dmd.getDriverVersion()+"-"+dmd.getUserName());
			
			ps=conn.prepareStatement(rQuery);
			
			rs=ps.executeQuery();
			
			rsmd=rs.getMetaData();
			
			System.out.println("Number Colums present in the General Table :" +rsmd.getColumnCount());
			
			System.out.println("Name Of the Column is:"+" "+rsmd.getColumnName(3)+"--"+rsmd.getColumnTypeName(2)+"--"+rsmd.getTableName(1)+""+rsmd.getColumnDisplaySize(2) );
			
			
	
			
//			ps.setInt(1, 2);
//			ps.setString(2, "Bharath");
//			ps.setString(3, "Eastgodavari");
//			
////			st = conn.createStatement();
//
//			ps.executeUpdate();
//
////			System.out.println("Table is Created!....");
//			System.out.println("Values are Inserted!....");
//			
			
//			rs=ps.executeQuery();
//			
//			System.out.println("Print data on Console");
//			while(rs.next()) {
//				
//				System.out.println(rs.getInt(1)+"-"+rs.getString(2)+"-"+rs.getString(3));
//			}
//			
			
//			ps.setString(1, "Karna");
//			
//			ps.setInt(2, 1);
//			
//			ps.executeUpdate();
//			
//			System.out.println("Successfully Updated");
			
//			ps.setInt(1, 2);
//			
//			
//			ps.executeUpdate();
//			System.out.println("Successfully Delated");

		} catch (Exception e) {

			System.out.println(e.getLocalizedMessage());

		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

		}

	}

}
