package org.example;

public class BankAccount {
    private int id ;
    private String owner;
    private int money;

    public BankAccount(int id, String owner, int money) {
        this.id = id;
        this.owner = owner;
        this.money = money;
    }

    @Override
    public String toString() {
        return "id:" + id + ", Имя:" + owner + ", Баланс:" + money ;
    }
}
