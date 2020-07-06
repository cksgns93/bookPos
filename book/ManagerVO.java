package book;




import java.sql.Date;
public class ManagerVO {
	
	
	private int empno;
	private String name;
	private String id;
	private String pwd;
	private int age;
	private String sex;
	private Date wdate;
	
	public ManagerVO() {
	}
	
	public ManagerVO(int empno, String name, String id, String pwd,  int age, String sex, Date wdate) {
		this.id=id; this.pwd=pwd; this.name=name; this.empno=empno; this.age=age;
		this.sex=sex; this.wdate=wdate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Date getWdate() {
		return wdate;
	}

	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}