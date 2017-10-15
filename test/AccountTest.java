import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;

public class AccountTest {
    private Random randomId = new Random();
    private int id = randomId.nextInt();

    Account myAccount = new Account(id, "Laura", 100000.00);

    @Test
    public void withdraw() throws Exception {
        myAccount.withdraw(5000.00);
        assertEquals("withdraw failed", 95000.00, myAccount.getBalance(), 0.001);
    }

    @Test
    public void deposit() throws Exception {
        myAccount.deposit(5000.00);
        assertEquals("withdraw failed", 105000.00, myAccount.getBalance(), 0.001);
    }

}