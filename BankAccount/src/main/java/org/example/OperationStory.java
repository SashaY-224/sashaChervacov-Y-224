package org.example;

public class OperationStory {
    private final int id;
    private final String operationName;
    private final String date;
    private final int bankAccount_id;
    private final String description;
    public int getId() {
        return id;
    }
    public String getOperationName() {
        return operationName;
    }

    public String getDate() {
        return date;
    }

    public int getbankAccount() {
        return bankAccount_id;
    }

    public String getDescription() {
        return description;
    }

    public OperationStory(int id, String operationName, String date, int bankAccount_id, String description) {
        this.id = id;
        this.operationName = operationName;
        this.date = date;
        this.bankAccount_id = bankAccount_id;
        this.description = description;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", operationName='" + operationName + '\'' +
                ", date='" + date + '\'' +
                ", bankAccount_id=" + bankAccount_id +
                ", description='" + description + '\'';
    }
}
