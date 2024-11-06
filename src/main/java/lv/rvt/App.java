package lv.rvt;

import java.util.*;


public class App 
{
    public static void main(String[] args) {
        

        Account account = new Account("Account's balance:", 100.00);
            
        System.out.println("Initial state");
        System.out.println(account);
            
        account.deposit(20);
        System.out.println("The balance of account is now: " + account.balance());
            
        System.out.println("End state");
        System.out.println(account);


    }
}
