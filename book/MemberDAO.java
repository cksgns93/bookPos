package book;

import java.sql.*;
import java.util.*;

public class MemberDAO {
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	//데이터베이스와 연동하여 모든 회원 정보를 ResultSet으로 받아와 책 정보를 ArrayList로 반환하는 기능을 수행한다.
	public List<MemberVO> selectMembereAll(){
		try {
			con=DBUtil.getCon();
			String sql="select * from bookMember";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			List<MemberVO> arr= makeList(rs);
			return arr;
		} catch (Exception e) {
			return null;
		}finally{
			close();
		}
	}
	public List<MemberVO> makeList(ResultSet rs) throws SQLException{
		List<MemberVO> arr=new ArrayList<>();
		
		while(rs.next()) {
			String name = rs.getString("mb_name");
			String phonNum = rs.getString("mb_phonNum");
			String address = rs.getString("mb_address");
			String email = rs.getString("mb_email");
			int addOkay = rs.getInt("mb_addOkay");
			int mileage = rs.getInt("mb_mileage");
			MemberVO m = new MemberVO(name,phonNum,address,email,addOkay,mileage);
			arr.add(m);
		}
		return arr;
	}
	//데이터베이스와 연동하여 이름에 해당하는 회원 정보를 ResultSet으로 받아와 책 정보를 ArrayList로 반환하는 기능을 수행한다.
	public List<MemberVO> selectByPhon(String phonNum){
		try {
			con=DBUtil.getCon();
			String sql="select * from bookMember where mb_phonNum=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, phonNum);
			rs=ps.executeQuery();
			List<MemberVO> arr= makeList(rs);
			return arr;
		} catch (Exception e) {
			return null;
		}finally{
			close();
		}
	}
	//데이터베이스와 연동하여 전화번호가 일치하는 직원 정보에 대해서 해당 정보를 삭제하는 기능을 수행한다.
	public boolean deleteByPhon(String phon) {
		try {
			con=DBUtil.getCon();
			String sql="delete bookMember where mb_phonNum=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, phon);
			int n = ps.executeUpdate();
			return n>0? true : false;
		} catch (Exception e) {
			return false;
		}finally{
			close();
		}
	}
	//데이터베이스와 연동하여 전화번호가 일치하는 직원 정보에 대해서 변경 내용을 update해주는 기능을 수행한다.
	public boolean updateMember(MemberVO member) {
		try {
			con=DBUtil.getCon();
			String sql="update bookMember set MB_NAME = ?, MB_PHONNUM =?, MB_ADDRESS = ?,MB_EMAIL = ?, MB_ADDOKAY = ? where mb_phonNum=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, member.getName());
			ps.setString(2, member.getPhonNum());
			ps.setString(3, member.getAddress());
			ps.setString(4, member.getEmail());
			ps.setInt(5, member.getAddOkay());
			ps.setString(6, member.getPhonNum());
			int n=ps.executeUpdate();
			return n>0? true : false;
		} catch (Exception e) {
			return false;
		}finally{
			close();
		}
	}
	//MemberVO가 가지는 데이터를 받아서 데이터베이스와 연동하여 테이블에 등록하는 기능을 수행한다.
	public boolean insertMember(MemberVO e) {
		try {
			con=DBUtil.getCon();
			String sql="insert into bookmember values(?,?,?,?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setString(1, e.getName());
			ps.setString(2, e.getPhonNum());
			ps.setString(3, e.getAddress());
			ps.setString(4, e.getEmail());
			ps.setInt(5, e.getAddOkay());
			ps.setInt(6, e.getMileage());
			int n = ps.executeUpdate();
			return n>0? true: false;
		} catch (Exception e1) {
			e1.printStackTrace();
			return false;
		}finally{
			close();
		}
	}
	public void close() {
		try {
			if(rs!=null) rs.close();
			if(ps!=null) ps.close();
			if(con!=null) con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}