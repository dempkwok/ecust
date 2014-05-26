package demp.soft.DAO;

import java.sql.*;

import demp.soft.DB.GetConnection;

public class LoginDAO {

	Connection con;

	public LoginDAO() {
		con = new GetConnection().getCon();
	}

	public int login(String name, String pwd) {
		int isok = 0;
		try {
			CallableStatement cst = con.prepareCall("{CALL Login_Proc(?,?,?)}");
			cst.setString(1, name);
			cst.setString(2, pwd);
			cst.registerOutParameter(3, 4);
			cst.executeUpdate();
			isok = cst.getInt(3);
			cst.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isok;
	}

	public void insert(String name, String pwd, String email, String address,
			String tel) {
		String sql = "INSERT tb_user(Username,Password,Email,Address,Tel) VALUES('"
				+ name
				+ "','"
				+ pwd
				+ "','"
				+ email
				+ "','"
				+ address
				+ "','"
				+ tel + "')";
		try {
			Statement sta = con.createStatement();
			sta.executeUpdate(sql);
			sta.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
