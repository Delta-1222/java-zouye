package codetest11;

import java.util.Date;
import java.util.ArrayList;

public class Account {
	private int id;
	private double balance;
	private double Rate;
	private Date dateCreated;
	private String name;
	ArrayList<Transaction> transactions;

	public Account(){
		id = 0;
		balance = 0;
		Rate = 0;
		dateCreated = new Date();
		transactions = new ArrayList<Transaction>();
	}
	
	public Account(int i ,double b){
		id = i;
		balance = b;
		Rate = 0;
		dateCreated = new Date();
		transactions = new ArrayList<Transaction>();
	}
	
	public Account(int i, double b, String n) {
		id = i;
		balance = b;
		Rate = 0;
		dateCreated = new Date();
		name = n;
		transactions = new ArrayList<Transaction>();
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int j) {
		id = j;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double j) {
		balance = j;
	}
	
	public double getAnnualInterestRate() {
		return Rate;
	}
	
	public void setAnnualInterestRate(double j) {
		Rate = j;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return Rate/12;
	}
	
	public double getMonthlyInterest() {
		return Rate/12*balance;
	}
	
	public void withDraw(double m,String s) {
		balance -= m;
		transactions.add(new Transaction('W',m,balance,s));
	}
	
	public void deposit(double m,String s) {
		balance += m;
		transactions.add(new Transaction('D',m,balance,s));
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}

	
}


