import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	@Test
	public void GetCurrentBalance_Returns0_WhenCalled() {
		
		// it begins with an empty balance
		Account account = new Account(0);
		assertEquals(0, account.getCurrentBalance());
		
	
	}
	@Test
	public void setDepositAmount_addToCurrentBalance_WhenCalled() {
		
		// it begins with an empty balance
		Account account = new Account(0);
		account.setDepositAmount(50);
		assertEquals(50, account.getCurrentBalance());
		
	
	}
	
	@Test
	public void setWithdrawAmount_subFromCurrentBalance_WhenCalled() {
		
		// it begins with an empty balance
		Account account = new Account(0);
		account.setDepositAmount(50);
		account.setWithdrawAmount(25); 
		assertEquals(25, account.getCurrentBalance());	
	
	}
	
	
	@Test(expected = Exception.class)
	public void whenExceptionThrown_thenExpectationSatisfied() {
		Account account = new Account(0); 
		account.setWithdrawAmount(25);	
	}
	
	
	
//	public void setWithdrawAmount_raisesErrorIfNoFunds_WhenCalled() {
//	
//	
//	// raises error if users hasnt got enough money
////		public void test15() throws Exception {
////			Account account = new Account(0); 	
////			assertEquals("You don't have enough funds!", account2.setWithdrawAmount(25));
//
//	}

}
