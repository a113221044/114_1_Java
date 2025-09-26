// 帳戶類別，代表一個銀行帳戶
public class Account {
    // 帳戶號碼
    private String accountNumber;
    // 帳戶餘額
    private double balance;// 帳戶類別，代表一個銀行帳戶

    public  Account (String accountNumber, double initialBalance){
        this.accountNumber = accountNumber;
        this.balance = initialBalance;

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

  public void setBalance(double balance) {
    if (balance<0){
        throw new IllegalAccessException("Balance cannot be negative");
    }
    this.balance=balance;
  }
        // 帳戶號碼
 public void deposit(double amount) {
    if (amount > 0) {
        balance += amount;
    } else {
        throw new IllegalArgumentException("Deposit amount must be positive");
    }
 }
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
     } else {
         throw new IllegalArgumentException("Invalid withdraw amount");
     }
 }