package com.yedam;

public class Account {
	private String aNo;
	private String owner;
	private int balance;

	public Account(String aNo, String owner, int balance) {
		this.aNo = aNo;
		this.owner = owner;
		this.balance = balance;
	}

	public String getaNo() {
		return aNo;
	}

	public void setaNo(String aNo) {
		this.aNo = aNo;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void showAccountInfo() {
		System.out.println("------------------");
		System.out.println("     [계좌생성]");
		System.out.println("------------------");
		System.out.println("계좌번호: " + aNo + "\n계좌주: " + owner + "\n최초입금액: " + balance);
	}

	public void accountListInfo() {
		System.out.printf("%10s | %10s | %10d\n", aNo, owner, balance);
	}
}
