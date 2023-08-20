package lesson32.sync.counters;

import lesson32.sync.balance.BalanceExample;

import java.sql.SQLOutput;

public class TestCounter {
    public static void main(String[] args) throws InterruptedException {
        // создать экземпляр счетчика
        //  CounterClassic cc = new CounterClassic();

        CounterSync cc = new CounterSync();

        // создайте два потока, передав в них экземпляр счетчика
        Thread t1 = new Thread(cc, "First");
        Thread t2 = new Thread(cc, "Second");
        // запустите эти потоки
        t1.start();
        t2.start();

        // дождитесь окончания их выполнения
        t1.join();
        t2.join();

        // распечатайте значение счетчика
        System.out.println(cc.getCounter());


        // создайте по мотивам CounterClassic другой счетчик CounterSync

    }
}

