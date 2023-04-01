package lesson2.bank;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class LoanTester {

    public static void main(String[] args) {

//        LoanTaker misha = new LoanTaker("Misha", 21_000, 73);
//        LoanTaker alex = new LoanTaker("Alex", 26_000, 30);
//        LoanIssuer dina = new LoanIssuer("Dina", true, false);
//        LoanIssuer foma = new LoanIssuer("Foma", false, false);
//
//        System.out.println(dina.toIssue(misha));
//        System.out.println(foma.toIssue(alex));

        Account account = new Account("HABA0055LV12345", "Pavel_Yu", 10_000);
        Account account2 = new Account("HABA0055LV56789", "Irina_Yu", 5_000);

        System.out.println();
        System.out.println("Start balance on my account = " + account.getBalance() + "$");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Account after I've credited 2000$ = " + account.credit(2_000) + "$");
        System.out.println("-----------------------------------------------------------");
        System.out.println("My account after I've debited 5000$ = " + account.debit(5_000) + "$");
        System.out.println("-----------------------------------------------------------");
        System.out.println("My wife's account after I've transferred her money = " + account2.debit(5_000) + "$" );
        System.out.println("-----------------------------------------------------------");
        System.out.println("My wifes's acc., after I've transferred 1000$ back to my account = " + account2.transfer(account, 1_000)+"$");
        System.out.println("-----------------------------------------------------------");
    }


}
