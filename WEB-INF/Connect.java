package conn;

import java.sql.*;

public class Connect
{
    public Connect()
	{
		
	}
	public Connection connex() throws Exception 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","sambo","sambo");
		return conn;
	}
	

}




