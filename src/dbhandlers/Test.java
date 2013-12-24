package dbhandlers;

import java.sql.ResultSet;

import dbhandlers.SQLBackend;

public class Test {

	public static void main(String args[]) throws Exception{
		SQLBackend sql = new SQLBackend();
		sql.connectMySQL("166.111.68.40", "sqlsugg", "sqlsugg", "twitter");
		
		String SQL = "select * from tweets limit 10";
		ResultSet rs = sql.executeQuery(SQL);
		while(rs.next()){
			double coordinate_x = rs.getInt("coordinate_x");
			double coordinate_y = rs.getInt("coordinate_y");
			String text = rs.getString("text");
			System.out.println(coordinate_x + ", " + coordinate_y + ": " + text);
		}
	}
	
}
