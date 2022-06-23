package com.ayaz.users;

public class AccountDetails {
	private String accNo;
	private String accHolder;
	private int amount;
	private String password;
	public AccountDetails(String accName, String accHHolder, int amount, String password) {
		super();
		this.accNo = accName;
		this.accHolder = accHHolder;
		this.amount = amount;
		this.password = password;
	}
	public String getAccName() {
		return accNo;
	}
	public void setAccName(String accName) {
		this.accNo = accName;
	}
	public String getAccHHolder() {
		return accHolder;
	}
	public void setAccHHolder(String accHHolder) {
		this.accHolder = accHHolder;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
