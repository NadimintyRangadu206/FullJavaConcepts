package com.general.purpose;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FirstProgram {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Map<String, Integer> map = new HashMap<>();

		map.put("Hyderabad", 1);
		map.put("Bangalore", 2);
		map.put("Mumbai", 3);
		map.put("Pune", 4);
		map.put("Delhi", 5);
		map.put("Kerala", 6);
		map.put("Chennai", 7);

		for (int i = 0; i < map.size(); i++) {

			System.out.println(map.get(i));
		}
		System.out.println(map.keySet());

		System.out.println(map.values());

		Set s = map.entrySet();

		Iterator it = s.iterator();

		while (it.hasNext()) {

			Map.Entry entry = (Map.Entry) it.next();
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}

		for (Map.Entry e : map.entrySet()) {

			System.out.println(e.getKey() + "=" + e.getValue());

		}

		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEach(System.out::print);

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection com = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "1234");

		String cQuery = "create table practice( id int not null primary key auto_increment, name varchar(255) not null, address varchar(255) not null )";

		Statement st = com.createStatement();

//		st.executeUpdate(cQuery);

//		String iQuery = "insert into practice (name,address) values('Venky','Hyderabad')";
//		
//		        st.executeUpdate(iQuery);

		String uQuery = "update practice set name='idrus' where id=2 ";

//		        st.executeUpdate(uQuery);

//		       String dQuery="delete from practice where id=3";

//		       st.executeUpdate(dQuery);

		String sQuery = "select * from practice";

//		        PreparedStatement ps= com.prepareStatement(sQuery);
		st.executeQuery(sQuery);

		ResultSet rs = st.executeQuery(sQuery);

		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String address = rs.getString(3);

			System.out.println(id + "-" + name + "-" + address);
		}

		String createQuery= "create table test(id int  not null primary key auto_increment, name varchar(255) not null, address varchar(255) not null)";
		
//		PreparedStatement ps=com.prepareStatement(createQuery);
//		ps.executeUpdate();
		
		
		String inQuery="insert into test(name,address) values(?,?)";
//		
//		PreparedStatement ps=com.prepareStatement(inQuery);
//		
//		ps.setString(1, "Venu");
//		ps.setString(2, "Bangalore");
//		
//		ps.executeUpdate();
		
		
		String upQuery="update test set name=? where id=?" ;
		PreparedStatement ps=com.prepareStatement(upQuery);
		ps.setString(1, "Ranga");
		ps.setInt(2, 1);
		ps.executeUpdate();
		
	}

}
