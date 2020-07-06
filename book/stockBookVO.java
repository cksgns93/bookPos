package book;

public class stockBookVO {
	private String code;
	private int count;
	
	public stockBookVO() {
		
	}
	
	public stockBookVO(String code,int count) {
		this.code=code;
		this.count=count;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}