package book;
import java.io.*;
import java.sql.*;
public class MemberVO {

		private String name;
		private String phonNum;
		private String address;
		private String email;
		private int addOkay;
		private int mileage;
		public MemberVO(String name, String phonNum, String address, String email, int addOkay, int mileage) {
			this.name = name;
			this.phonNum = phonNum;
			this.address = address;
			this.email = email;
			this.addOkay = addOkay;
			this.mileage = mileage;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhonNum() {
			return phonNum;
		}
		public void setPhonNum(String phonNum) {
			this.phonNum = phonNum;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getAddOkay() {
			return addOkay;
		}
		public void setAddOkay(int addOkay) {
			this.addOkay = addOkay;
		}
		public int getMileage() {
			return mileage;
		}
		public void setMileage(int mileage) {
			this.mileage = mileage;
		}
		
		
		
}