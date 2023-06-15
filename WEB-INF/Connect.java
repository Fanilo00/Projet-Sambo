package conn;

import java.sql.*;

public class Connexion 
{
	public Connection connex() throws Exception 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","sambo","sambo");
		return conn;

	}
	public Connexion()
	{
		
	}

}




