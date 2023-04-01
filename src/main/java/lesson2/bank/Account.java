package lesson2.bank;

public class Account {
    private String id;
    private String owner;
    private int balance;

    // добавить constructor

    public Account(String id, String owner, int balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }

    // добавить getter

    public String getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }


    // добавление денег на_счет
    // и возвращение полученного баланса
    public int debit(int money) {
        if (money < 0) {
            System.out.println("отрицательная сумма для дебита");
        } else {
            balance += money;
        }
        return balance;
    }

    // удаление денег со счета
    // нельзя удалить больше чем на счете есть
    // при попытке удалить больше, не нужно менять баланс счета, но нужно
    // печатать об этом сообщение
    // возвращается количество денег оставшихся на балансе
    public int credit(int money) {
        if (money > balance) {
            System.out.println("Сумма больше баланса");
            return 0;
        }
        balance -= money;
        return balance;
    }

    // перевод денег со счета на счет
    // кредитуем свой счет и дебетуем account
    // возвращается баланс счета
    // при попытке снять больше чем есть на счете нужно печатать сообщение
    public int transfer(Account account, int amount) {
        if (balance >= amount) {
            balance -= amount; // дебетуем наш счет
            account.credit(amount); // кредитуем другой счет
            return balance;
        } else {
            System.out.println("Недостаточно средств на счете");
            return balance;
        }
    }
}



