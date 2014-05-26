package demp.soft.DB;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class GetDPConnection {
	private String driver;
	private String url;
	private String username;
	private String password;

	// private Properties p;

	public GetDPConnection() {
		driver = "";
		url = "";
		username = "";
		password = "";
		/*

		 */
		try {
			driver = this.getDriver();
			url = this.getURL();
			username = this.getUserName();
			password = this.getPwd();
		} catch (Exception e) {
			driver = "com.mysql.jdbc.Driver";
			url = "jdbc:mysql://127.0.0.1:3306/db_designpatent";
			username = "root";
			password = "dempkwok";
		}
	}

	public Connection getCon() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public String getURL() throws IOException {
		Properties p = new Properties();
		p.load(GetConnection.class
				.getResourceAsStream("DBConnection.properties"));
		return p.get("urldp").toString();
	}

	public String getUserName() throws IOException {
		Properties p = new Properties();
		p.load(GetConnection.class
				.getResourceAsStream("DBConnection.properties"));
		return p.get("username").toString();
	}

	public String getPwd() throws IOException {
		Properties p = new Properties();
		p.load(GetConnection.class
				.getResourceAsStream("DBConnection.properties"));
		return p.get("password").toString();
	}

	public String getDriver() throws IOException {
		Properties p = new Properties();
		p.load(GetConnection.class
				.getResourceAsStream("DBConnection.properties"));
		return p.get("driver").toString();
	}
}
