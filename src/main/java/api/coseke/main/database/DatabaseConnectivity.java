package api.coseke.main.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnectivity {
	
	public static Connection ConnectToDB() throws Exception {
		String mysqlUrl = "jdbc:mysql://localhost/infofiledb";
		Connection con = DriverManager.getConnection(mysqlUrl, "root", "Herman000!");
		System.out.println("....... Connection established ......");
		return con;
	}
}
