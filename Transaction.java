public class Transaction {
    private String operation;
    private double amount;
    private double balance;
    //
    public void setOperation(String operation) {
        this.operation = operation;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    //setter Operation,amount,blance
//
    public String getOperation() {
        return operation;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }
    //getter Operation,amount,blance
    public static final String DEPOSIT =null;
    public static final String WITHDRAW =null;

    public Transaction(String operation,double amount,double balance){
        this.operation =operation;
        this.amount = amount;
        this.balance = balance;
    }
}