package book;
import java.io.*;
import java.sql.*;
import java.sql.Date;
import java.util.*;




public class MmgDAOtest {
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	//데이터베이스와 연동하여 모든 매니저 정보를 ResultSet으로 받아와 책 정보를 ArrayList로 반환하는 기능을 수행한다.
	private ArrayList<ManagerVO> selectManagerAll() 
	{
		try {
		con=DBUtil.getCon();
		String sql="select * from manager";
		ps=con.prepareStatement(sql);
		rs=ps.executeQuery();
		ArrayList<ManagerVO> arr=makeList(rs);	
		return arr;
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}finally {
			close();
		}
	}
	private ArrayList<ManagerVO> makeList(ResultSet rs) throws SQLException{

		ArrayList<ManagerVO> arr= new ArrayList<>();
			while(rs.next()) {
				
				int empno=rs.getInt("mg_empno");
				String name=rs.getString("mg_name");
				String id=rs.getString("mg_id");
				String pwd=rs.getString("mg_pwd");
				int age= rs.getInt("mg_age");
				String sex=rs.getString("mg_sex");
				Date wdate=rs.getDate("mg_Date");
				ManagerVO manager=new ManagerVO(empno, name, id, pwd, age, sex, wdate);
				arr.add(manager);
			}
			return arr;
	}
	//데이터베이스와 연동하여 이름에 해당하는 매니저 정보를 ResultSet으로 받아와 책 정보를 ArrayList로 반환하는 기능을 수행한다.
	private ArrayList<ManagerVO> selectByName(String name) 
	{
		try {
			con=DBUtil.getCon();
			String sql="select * from manager";
				  sql+= " where name=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, name);
			rs=ps.executeQuery();
			ArrayList<ManagerVO> arr=makeList(rs);
			return arr;
			} catch (SQLException e) {
			e.printStackTrace();
			return null;
			}finally {
			close();
			}
	}
	//데이터베이스와 연동하여 empno가 일치하는 직원 정보에 대해서 해당 정보를 삭제하는 기능을 수행한다.
	private void deleteByEmpno(int empno)throws SQLException{
		con=DBUtil.getCon();
		String sql="delete from manager";
		sql+= " where empno=?";
		ps=con.prepareStatement(sql);
		ps.setInt(1, empno);
		int n=ps.executeUpdate();						
	}
	//데이터베이스와 연동하여 empno가 일치하는 직원 정보에 대해서 변경 내용을 update해주는 기능을 수행한다.
	private void updateByEmpno(int empno) throws SQLException {
		con=DBUtil.getCon();
		String sql="update manager set empno=?";
		ps=con.prepareStatement(sql);
		ps.setInt(1, empno);
		int n=ps.executeUpdate();
	}
	//ManagerVO가 가지는 데이터를 받아서 데이터베이스와 연동하여 테이블에 등록하는 기능을 수행한다.
	private void insertManager(ManagerVO e) throws SQLException{
		con=DBUtil.getCon();
		String sql="insert into manager";
			   sql+=" values(mg_empno_seq.nextval, ?, ?, ?, ?, ?, sysDate)";
		ps=con.prepareStatement(sql);
		ps.setString(1, e.getName());
		ps.setString(2, e.getId());
		ps.setString(3, e.getPwd());
		ps.setInt(4, e.getAge());
		ps.setString(5, e.getSex());
		int n=ps.executeUpdate();	
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
	public static void main(String[] args) {
		MmgDAOtest dao=new MmgDAOtest();
		ManagerVO manager=new ManagerVO(0, "변주한","w","123456", 20, "남", null);
		
		try {
			dao.insertManager(manager);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
