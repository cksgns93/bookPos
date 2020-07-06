package book;

/*
 * Book CRUD 수행
 * 
 * */

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class BookDAO {
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public List<BookVO> selectBook() throws SQLException{
		try {
			con=DBUtil.getCon();
			String sql = "SELECT * FROM Book";
			ps=con.prepareStatement(sql);
			rs = ps.executeQuery();
			List<BookVO> arr=makeList(rs);
			return arr;
		}finally {
			close();
		}
	}
	public List<BookVO> selectByBarcode(String barcode) throws SQLException{
		try {
			con=DBUtil.getCon();
			String sql = "SELECT * FROM Book where bbCode=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, barcode);
			rs = ps.executeQuery();
			List<BookVO> arr=makeList(rs);
			return arr;
		}finally {
			close();
		}
	}
	public String selectByName(String name) throws SQLException{
		try {
			con=DBUtil.getCon();
			String sql = "SELECT * FROM Book where bbName=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, name);
			rs = ps.executeQuery();
			List<BookVO> arr=makeList(rs);
			if(arr.size()==0) {
				return "없음";
			}
			return arr.get(0).getCode();
		}finally {
			close();
		}
	}
	public List<BookVO> makeList(ResultSet rs) throws SQLException{
		List<BookVO> arr=new ArrayList<>();
		
		while(rs.next()) {
			String code = rs.getString("bbCode");
			String name = rs.getString("bbName");
			int price = rs.getInt("bbPrice");
			BookVO m = new BookVO(code,name,price);
			arr.add(m);
		}
		return arr;
	}
	
	public boolean insertBook(BookVO e) {
		try {
			con =DBUtil.getCon();
			String sql="insert into Book(bbCode,bbName,bbPrice)";
			sql+=" values(?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setString(1, e.getCode());
			ps.setString(2, e.getName());
			ps.setInt(3, e.getPrice());
			int n = ps.executeUpdate();
			System.out.println(n);
			return true;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			return false;
		} finally {
			close();
		}
	}
	
	public int deleteBook(String idx) throws SQLException{
		try {
			con=DBUtil.getCon();
			String sql="DELETE FROM Book WHERE bbCode=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, idx);			
			int n=ps.executeUpdate();
			System.out.println(n);
			return n;
		}finally {
			close();			
		}
	}
	
	public int updateBook(BookVO book) throws SQLException{
		try {
			con=DBUtil.getCon();
			String sql="UPDATE Book set bbPrice=?,bbName=? where bbCode=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1, book.getPrice());
			ps.setString(2, book.getName());
			ps.setString(3, book.getCode());
			int n = ps.executeUpdate();
			return n;
		}finally {
			close();
		}
	}
	
	public void close() {
		try {
			if(rs!=null) rs.close();
			if(ps!=null) ps.close();
			if(con!=null) con.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		BookVO vo = new BookVO("S1", "어린왕자", 9000);
		BookVO vo1 = new BookVO("S2", "행복이란무엇인가", 10000);
		BookVO vo2 = new BookVO("S3", "총균쇠", 8000);
		BookDAO dao = new BookDAO();
		
		//insert
		dao.insertBook(vo);
		dao.insertBook(vo1);
		dao.insertBook(vo2);
		
		//delete
//		try {
//			dao.deleteBook("S3");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		//update
		//select
//		try {
//			BookVO m = dao.selectBook().get(0);
//			System.out.println(m.getCode());
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
}
