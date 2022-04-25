package tdd;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AccountTest {
    @Test
    public void accountToBeCreated(){
       //given I have created an account
        Account davidAccount = new Account();

        // when I check my balance
        int balance = davidAccount.getBalance();

        //confirm that my balance is zero
        assertEquals(0, balance);
    }
    @Test
    public void depositMoneyTest(){
        //given I have an account
            Account depo = new Account();
            //when I deposit money
                depo.deposit(3_000);
            //check that my balance has changed
        assertEquals(3_000, depo.getBalance());
    }

    @Test
    public  void depositMoneyTwice(){
        Account dav = new Account();
        dav.deposit(2_500);
        dav.deposit(1_300);

        assertEquals(3_800, dav.getBalance());
    }
    @Test
    @DisplayName("Desposit negative amount should not change balance test")
    public void depositNegativeAccountTest(){
        //given that  I have an account;
        Account dav = new Account();
        //when i desposit negative amount
        dav.deposit(-1_500);
        //check that balance has not changed
        assertEquals(0, dav.getBalance());
    }
    @Test
    public void withdrawal(){
        Account davAccount = new Account();
        davAccount.deposit(5_000);
        davAccount.withdrawal(2_000);
        assertEquals(3_000, davAccount.getBalance());
    }
    @Test
    public void  negativeWithdrawal(){
        Account segAccount = new Account();
        segAccount.deposit(0);
        segAccount.withdrawal(-2_000);
        assertEquals(0, segAccount.getBalance());
    }
    @Test
    public void excessWithdrawal(){
        Account dejAccount = new Account();
        dejAccount.deposit(7_000);
        dejAccount.withdrawal(10_000);
        assertEquals(7_000, dejAccount.getBalance());
    }
}
