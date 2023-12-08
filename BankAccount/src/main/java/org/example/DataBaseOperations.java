package org.example;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class DataBaseOperations {
    private final static String userName = "root";
    private final static String password = "1234";
    private final static String connectionUrl = "jdbc:mysql://localhost:3306/newschema";

    private static Connection connection;

    private static Connection getConnection() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(connectionUrl, userName, password);
        }
        return connection;
    }

    public DataBaseOperations() {
    }

    public void addMoneyOnBankAccount(int id, int money, String data) {
        try {
            String sql = "UPDATE bank_account SET amount = amount + ? WHERE idbank_account = ?";
            PreparedStatement statement = getConnection().prepareStatement(sql);
            statement.setInt(1, money);
            statement.setInt(2, id);
            statement.execute();


            String description = "Добавлено на счет - " + money;
            sql = "INSERT INTO operationstory (data, idbank_account, operation, description) VALUES (?, ?, ?, ?)";
            statement = getConnection().prepareStatement(sql);
            statement.setString(1, data);
            statement.setInt(2, id);
            statement.setString(3, "Пополнейние средств");
            statement.setString(4, description);
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void withdrawMoneyFromTheAccount(int id, int money, String data) {
        try {
            String sql = "UPDATE bank_account SET amount = amount - ? WHERE idbank_account = ?";
            PreparedStatement statement = getConnection().prepareStatement(sql);
            statement.setInt(1, money);
            statement.setInt(2, id);
            statement.execute();


            String description = "Cнято со счета - " + money;
            sql = "INSERT INTO operationstory (data, idbank_account, operation, description) VALUES (?, ?, ?, ?)";
            statement = getConnection().prepareStatement(sql);
            statement.setString(1, data);
            statement.setInt(2, id);
            statement.setString(3, "Съем средств");
            statement.setString(4, description);
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void openAccount(String data, String owner, int amount) {
        try {
            String sql = "INSERT INTO bank_account (owner, amount) VALUES (?, ?)";
            PreparedStatement statement = getConnection().prepareStatement(sql);
            statement.setString(1, owner);
            statement.setInt(2, amount);
            statement.execute();

            sql = "SELECT MAX(idbank_account) AS idbank_account FROM bank_account";
            statement = getConnection().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery(sql);

            int id = 0;
            if (resultSet.next()) {
                id = resultSet.getInt("idbank_account");
            }

            String description = "Cоздан счет на имя - " + owner;
            sql = "INSERT INTO operationStory (data, idbank_account, operation, description) VALUES (?, ?, ?, ?)";
            PreparedStatement statement1 = getConnection().prepareStatement(sql);
            statement1.setString(1, data);
            statement1.setInt(2, id);
            statement1.setString(3, "Создание счета");
            statement1.setString(4, description);
            statement1.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void closeAccount(int id, String data) {
        try {

            String sql = "DELETE FROM bank_account WHERE idbank_account = ?";
            PreparedStatement statement = getConnection().prepareStatement(sql);
            statement.setInt(1, id);
            statement.execute();


            String description = "Удален счет #" + id;
            sql = "INSERT INTO operationStory (data, idbank_account, operation, description) VALUES (?, ?, ?, ?)";
            PreparedStatement statement1 = getConnection().prepareStatement(sql);
            statement1.setString(1, data);
            statement1.setInt(2, id);
            statement1.setString(3, "Удаление счета");
            statement1.setString(4, description);
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<OperationStory> getHistoryOfOperation() {
        try {
            String sql = "SELECT * FROM operationstory";
            PreparedStatement statement = getConnection().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            List<OperationStory> res = new LinkedList<>();
            while (resultSet.next()) {
                res.add(new OperationStory(resultSet.getInt(1), resultSet.getString(4), resultSet.getString(2), resultSet.getInt(3), resultSet.getString(5)));
            }
            return res;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void handOver(int id1, int id2, int amount, String data) {
        addMoneyOnBankAccount(id2, amount, data);
        withdrawMoneyFromTheAccount(id1, amount, data);
    }

    public int getBalance(int idAccount) {
        try {
            String sql = "SELECT amount FROM bank_account where idbank_account = ?";
            PreparedStatement statement = getConnection().prepareStatement(sql);
            statement.setInt(1, idAccount);
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                return resultSet.getInt("amount");
            }
            return 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<BankAccount> getPivotTable() {
        try {
            String sql = "SELECT * FROM bank_account";
            PreparedStatement statement = getConnection().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            List<BankAccount> res = new LinkedList<>();
            while (resultSet.next()) {
                res.add(new BankAccount(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3)));
            }
            return res;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void registerOwner(String name) {
        try {
            String sql = "INSERT INTO owners (name) VALUES (?)";
            PreparedStatement statement1 = getConnection().prepareStatement(sql);
            statement1.setString(1, name);
            statement1.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
