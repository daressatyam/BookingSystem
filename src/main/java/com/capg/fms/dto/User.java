package com.capg.fms.dto;


final public class User {
	private String userType;
	private Integer userId;
	private String userName;
	private String userPassword;
	private Integer userPhone;
	private String email;




	public User(String userType, Integer userId, String userName, String userPassword, Integer userPhone,
			String email) {
		super();
		this.userType = userType;
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.email = email;
	}



	public String getUserType() {
		return userType;
	}



	public void setUserType(String userType) {
		this.userType = userType;
	}



	public Integer getUserId() {
		return userId;
	}



	public void setUserId(Integer userId) {
		this.userId = userId;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getUserPassword() {
		return userPassword;
	}



	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}



	public Integer getUserPhone() {
		return userPhone;
	}



	public void setUserPhone(Integer userPhone) {
		this.userPhone = userPhone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



//	private final List<Booking> bookings = new ArrayList<Booking>();

	

	//public List<Booking> getBookings() {
	//	return this.bookings;
//	}
}
