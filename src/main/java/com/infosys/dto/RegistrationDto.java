package com.infosys.dto;

public class RegistrationDto {

	
	    private String userName;
	    private String email;
	    private String password;
	    private String phone;
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public RegistrationDto(String userName, String email, String password, String phone) {
			super();
			this.userName = userName;
			this.email = email;
			this.password = password;
			this.phone = phone;
		}
		public RegistrationDto() {
			super();
			// TODO Auto-generated constructor stub
		}

	   
	

}
