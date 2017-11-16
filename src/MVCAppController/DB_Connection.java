package MVCAppController;

import java.sql.ResultSet;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Connection 
{
	public Connection c;
	public Statement s;
	public DB_Connection()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded successfully");
		} 
		catch (Exception e)
		{
			System.out.println("Please include path Where your Driver is located");
			e.printStackTrace();
		}
		try
		{
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnii_system", "root", "15august");
			System.out.println("Database Connected");
			s = c.createStatement();
		} 
		catch (SQLException e) 
		{
		   e.printStackTrace();
		   System.out.println("DB connection Failed OR Database Doesnot Exist");
		}
	}
	/*public static void main(String[] args)
	{
		try {
			DB_Connection db  = new DB_Connection();
			System.out.println("JDBC is OK");
			ResultSet rs =  db.s.executeQuery(" SELECT * FROM login ");
			if(rs!=null)
			{
				while(rs.next())
				{
					System.out.println("Name: "+rs.getString("username"));
				}
			}
			else
			{
				System.out.println("prob" );
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}*/
}

