package jdbcconnection;

import java.sql.Connection;

public class Insertion {
	
	Connection connection=null;

	public  void insert(String Firstname, String lastname, String gender, String email, String password, String location, int num, int amount, String currency){
		
			try
				{
					connection=new Databaseconnection().getconnect();
					java.sql.PreparedStatement psmt=connection.prepareStatement("Insert into details values(?,?,?,?,?,?,?,?,?);");
					 psmt.setString(1,Firstname);
					   psmt.setString(2,lastname);
					   psmt.setString(3, gender);
					   psmt.setString(4, email);
					   psmt.setString(5, password);
					   psmt.setString(6, location);
					   psmt.setInt(7, num);
					   psmt.setInt(8, amount);
					   psmt.setString(9, currency);
					   psmt.executeUpdate();
				}
				catch(Exception ex)
				{
					System.out.println(ex);
				}
				
	}

}
