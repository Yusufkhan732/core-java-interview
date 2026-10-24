package io.serilization;

import java.io.Serializable;

public class Account implements Serializable {

	public transient String name;
	public  int balance;

	public Account(String name, int balance) {
		this.name = name;
		this.balance = balance;

	}

	@Override
	public String toString() {
		return name + " " + balance;
	}

}