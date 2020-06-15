package Task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestingMethodsBankAccount {
    private BankAccount bankAccount;
    private double balance;

    @Before
    public void setUp() {
        bankAccount = new BankAccount(37, balance = 1555.5);

    }

    @Test
    public void checkDebit(){
    double money = 555.5;
    double expectedResult = balance - money;
    double actualResult = bankAccount.debit(money);
    Assert.assertTrue(actualResult == expectedResult);
    }
    @Test
    public void checkCredit1(){
        double money = 3456.4;
        double expectedResult = balance + money;
        double actualResult  = bankAccount.credit(money);
        Assert.assertTrue(actualResult == expectedResult);

    }




}
