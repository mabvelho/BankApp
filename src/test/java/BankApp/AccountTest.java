package BankApp;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {

	static Account account;
	
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//		
//	}
//
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//	}

	@Before
	public void setUp() throws Exception {
		account = new Account();		
	}

	@After
	public void tearDown() throws Exception {
		account.close();
	}

	@Test
	public void testDepositPositive() {
		
		double expected = 123.45;
		double actual;
		double delta = 0.009;
		
		account.deposit(expected);
		
		actual = account.getBalance();
		
		assertEquals(expected, actual, delta);
	}

	@Test
	public void testDepositNull() {		
		assertFalse(account.deposit(0.0));
	}
	
	@Test
	public void testDepositNegative() {		
		assertFalse(account.deposit(-100.0));
	}	
		
	@Test
	public void testWithdrawPositive() {
	
		double expected = 23.45;
		double actual;
		double delta = 0.009;
		
		account.deposit(123.45);		
		account.withdraw(100.00);
		
		actual = account.getBalance();
		
		assertEquals(expected, actual, delta);
	}
	
	@Test
	public void testWithdrawNull() {		
		assertFalse(account.withdraw(0));
	}
	
	@Test
	public void testWithdrawNegative() {		
		assertFalse(account.withdraw(-100.0));
	}
	
	@Test
	public void testWithdrawLimit() {
		
		double expected = 0;
		double actual;
		double delta = 0.009;
		
		account.deposit(123.45);		
		account.withdraw(123.45);
		
		actual = account.getBalance();
		
		assertEquals(expected, actual, delta);
	}
	
	@Test
	public void testWithdrawOverdraw() {
		
		// original balance is 0 after setUp, so any withdraw would overdraw
		assertFalse(account.withdraw(200.0));
	}
	
	@Test
	public void testStatementEmpty() {
		String noTransactionsMessage = "No transactions available for a bank statement.";
		
		assertEquals(noTransactionsMessage, account.statement());
	}
	
	@Test
	public void testStatement() {
		double firstDeposit = 200.0;
		double firstWithdraw = 100.0;
		double secondDeposit = 300.0;
		
		/*
		 *  dates below have to be initialized to the dates corresponding to the operations
		 * 	as they occurred 
		 */
		LocalDateTime firstDepositDate = null;
		LocalDateTime firstWithdrawDate = null;
		LocalDateTime secondDepositDate = null;
		
		
		account.deposit(firstDeposit);
		account.withdraw(firstWithdraw);
		account.deposit(secondDeposit);
		
//		String expected = String.format(
//				
//					"Bank statement:\n"
//					+ "\tType: Deposit; Date and Time: %s; Amount: %f\n"
//					+ "\tType: Withdraw; Date and Time: %s; Amount: %f\n"
//					+ "\tType: Deposit; Date and Time: %s; Amount: %f\n"
//				,
//				firstDepositDate.toString(),
//				firstDeposit,
//				firstWithdrawDate.toString(),
//				firstWithdraw,
//				secondDepositDate.toString(),
//				secondDeposit				
//				);
		String expected = "";
		
		String actual = account.statement();
		
		assertEquals(expected, actual);		
	}
}




















