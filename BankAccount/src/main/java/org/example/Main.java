package org.example;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        DataBaseOperations db = new DataBaseOperations();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Выберите команду:");
            System.out.println("1. Пополнить счет");
            System.out.println("2. Снять деньги со счет");
            System.out.println("3. Перевести деньги с одного счета на другой");
            System.out.println("4. Открыть счет");
            System.out.println("5. Закрыть счет");
            System.out.println("6. Получить историю операций");
            System.out.println("7. Регистрация клиента");
            System.out.println("8. Получить баланс счета");
            System.out.println("9. Общая таблица");
            System.out.println("0. Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Введите айди:");
                    int id = scanner.nextInt();
                    System.out.println("Введите сумму:");
                    int money = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Дата:");
                    String data = scanner.nextLine();
                    db.addMoneyOnBankAccount(id, money, data);
                    break;
                case 2:
                    System.out.println("Введите айди:");
                        id = scanner.nextInt();
                    System.out.println("Введите сумму:");
                    money = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Дата:");
                    data = scanner.nextLine();
                    db.withdrawMoneyFromTheAccount(id, money, data);
                    break;
                case 3:
                    System.out.println("Введите айди счета с которого нужно перевести деньги:");
                    id = scanner.nextInt();
                    System.out.println("Введите айди счета на который нужно перевести деньги:");
                    int id1 = scanner.nextInt();
                    System.out.println("Введите сумму:");
                    money = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Дата:");
                    data = scanner.nextLine();
                    db.handOver(id, id1, money, data);
                    break;
                case 4:
                    System.out.println("Владелец счета:");
                    String owner = scanner.nextLine();
                    System.out.println("Введите начальную суммусумму:");
                    money = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Дата:");
                    data = scanner.nextLine();
                    db.openAccount(data, owner, money);
                    break;
                case 5:
                    System.out.println("Введите айди счета который нужно закрыть:");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Дата:");
                    data = scanner.nextLine();
                    db.closeAccount(id, data);
                    break;
                case 6:
                    List<OperationStory>  list = db.getHistoryOfOperation();
                    for(OperationStory operation : list){
                        System.out.println(operation.toString());
                    }
                    break;
                case 7:
                    System.out.println("Введите Имя:");
                    String name = scanner.nextLine();
                    db.registerOwner(name);
                    break;
                case 8:
                    System.out.println("Введите айди счета:");
                    id = scanner.nextInt();
                    System.out.println("Баланс: " + db.getBalance(id));
                    break;
                case 9:
                    List<BankAccount>  list1 = db.getPivotTable();
                    for(BankAccount bankAccount : list1){
                        System.out.println(bankAccount.toString());
                    }
                    break;
                case 0:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Некорректная команда. Пожалуйста, выберите снова.");
            }
        }
    }


}