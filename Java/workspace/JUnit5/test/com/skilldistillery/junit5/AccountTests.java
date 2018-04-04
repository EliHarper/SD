package com.skilldistillery.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.skilldistillery.junit5.drills.Account;

@DisplayName("Account tests for depositing")
class AccountTests {
	
	private Account account;
	
	@BeforeEach
	void setUp() {
		account = new Account(100);
	}
	
	@AfterEach
	void tearDown() {
		account = null;
	}

	@Test
	//Beautiful DisplayName; not ugly_snake_case_everything
	@DisplayName("Test deposit(double) adds to the account balance")
	void testDeposit() {
		//Deposit money into the account
		account.deposit(100);
		//assertEquals account's balance is what we'd expect
		assertEquals(200, account.getBalance());
	}

}
