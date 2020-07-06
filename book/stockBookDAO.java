package book;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class stockBookDAO {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private CallableStatement cstmt; 
	public List<stockBookVO> selectStock() throws SQLException{
		try {
			con=DBUtil.getCon();
			String sql = "SELECT * FROM stockBook";
			ps=con.prepareStatement(sql);
			rs = ps.executeQuery();
			List<stockBookVO> arr=makeList(rs);
			return arr;
		}finally {
			close();
		}
	}
	
	public List<stockBookVO> makeList(ResultSet rs) throws SQLException{
		List<stockBookVO> arr=new ArrayList<>();
		
		while(rs.next()) {
			String code = rs.getString("sbCode");
			int count = rs.getInt("sbCount");
			stockBookVO m = new stockBookVO(code,count);
			arr.add(m);
		}
		return arr;
	}
	
	public int updateStock(String code, int count){
		try {
			con = DBUtil.getCon();
			String sql="{call sb_update(?,?)}";
			CallableStatement cstmt = con.prepareCall(sql);
			cstmt.setString(1, code);
			cstmt.setInt(2, count);
			boolean n = cstmt.execute();
			System.out.println("okay");
			return (n)? 1:0;
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}finally {
			close();
		}
	}
	
	
	public void close() {
		try {
			if(rs!=null) rs.close();
			if(ps!=null) ps.close();
			if(cstmt!=null) cstmt.close();
			if(con!=null) con.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		stockBookDAO dao = new stockBookDAO();
		dao.updateStock("S1", 3);
	}
}
