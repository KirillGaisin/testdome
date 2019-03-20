package com.gaisinkv.testdome.AccountTest;

import com.gaisinkv.testdome.Account.Account;
import org.junit.Assert;
import org.junit.Test;

//20min
public class AccountTest {
    private double epsilon = 1e-6;

    @Test
    public void accountCannotHaveNegativeOverdraftLimit() {
        Account account = new Account(-20);

        Assert.assertEquals(0d, account.getOverdraftLimit(), epsilon);
    }

    @Test
    public void testDepositWithdrawNegativeNumber() {
        Account account = new Account(100);
        Assert.assertFalse(account.deposit(-10));
        Assert.assertFalse(account.withdraw(-10));
    }

    @Test
    public void testAccountOverdraft() {
        Account account = new Account(100);
        Assert.assertFalse(account.withdraw(101));
    }

    @Test
    public void testDepositWithdrawCorrectAmount() {
        Account account = new Account(100);
        Assert.assertTrue(account.deposit(50));
        Assert.assertEquals(50, account.getBalance(), epsilon);
        Assert.assertTrue(account.withdraw(50));
        Assert.assertEquals(0, account.getBalance(), epsilon);
    }
}
