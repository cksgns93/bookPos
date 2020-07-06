package book;

import java.sql.Date;

public class BookVO {
	private String code;
	private String name;
	private int price;
	private String writer;
	private Date registerDate;

	public BookVO() {
		this(null,null,0);
	}
	public BookVO(String code, String name, int price) {
		this.setCode(code);
		this.setName(name);
		this.setPrice(price);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	
}
