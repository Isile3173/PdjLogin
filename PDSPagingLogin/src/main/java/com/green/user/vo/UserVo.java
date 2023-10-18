package com.green.user.vo;

public class UserVo {
	// Fields
	private String user_id;
	private String pass_pwd;
	private String user_name;
	private String user_birth;
	private String email;
	private String acount_date;
	
	// Constructor
	public UserVo(String user_id, String pass_pwd, String user_name, String user_birth, String email,
			String acount_date) {
		super();
		this.user_id = user_id;
		this.pass_pwd = pass_pwd;
		this.user_name = user_name;
		this.user_birth = user_birth;
		this.email = email;
		this.acount_date = acount_date;
	}
    
	// Getter/Setter
	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPass_pwd() {
		return pass_pwd;
	}

	public void setPass_pwd(String pass_pwd) {
		this.pass_pwd = pass_pwd;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_birth() {
		return user_birth;
	}

	public void setUser_birth(String user_birth) {
		this.user_birth = user_birth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAcount_date() {
		return acount_date;
	}

	public void setAcount_date(String acount_date) {
		this.acount_date = acount_date;
	}
    
	// toString
	@Override
	public String toString() {
		return "UserVo [user_id=" + user_id + ", pass_pwd=" + pass_pwd + ", user_name=" + user_name + ", user_birth="
				+ user_birth + ", email=" + email + ", acount_date=" + acount_date + "]";
	}
	
	
	
}
