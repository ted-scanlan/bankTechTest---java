import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	@Test
	public void AccountTest() {
		
		// it begins with an empty balance
		Account account = new Account();
		
		assertEquals(0, account.getCurrentBalance());
		
		
	}

}
