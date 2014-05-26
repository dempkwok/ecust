package demp.soft.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import demp.soft.DB.GetConnection;
import demp.soft.DB.GetDPConnection;

public class ClassificationDAO {
	private Connection con;

	public ClassificationDAO() {
		con = new GetDPConnection().getCon();
	}

	public List<String> GetClassSec(String fir) {
		ArrayList<String> result = new ArrayList<String>();
		String sql = "SELECT CSName,CSDescribe " + "FROM tb_ClassificationSec"
				+ " WHERE CFName ='" + fir + "'";
		try {
			ResultSet rs;
			Statement state = con.createStatement();
			rs = state.executeQuery(sql);
			while (rs.next()) {
				result.add(rs.getString(1)+" "+rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

}
