package com.truongpham.shoppingcart.form;

public class AccountForm {
	private String userName;
	private String encrytedPassword;
	private String confirmPassword;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEncrytedPassword() {
		return encrytedPassword;
	}

	public void setEncrytedPassword(String encrytedPassword) {
		this.encrytedPassword = encrytedPassword;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public AccountForm(String userName, String encrytedPassword, String confirmPassword) {
		super();
		this.userName = userName;
		this.encrytedPassword = encrytedPassword;
		this.confirmPassword = confirmPassword;
	}

	public AccountForm() {
		super();
	}

}
