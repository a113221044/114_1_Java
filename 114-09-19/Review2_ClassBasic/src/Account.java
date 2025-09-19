// 帳戶類別，代表一個銀行帳戶
public class Account {
    // 帳戶號碼
    private String accountNumber;
    // 帳戶餘額
    private double balance;// 帳戶類別，代表一個銀行帳戶
    public class Account {
        // 帳戶號碼
        private String accountNumber;
        // 帳戶餘額
        private double balance;

        // 建構子，初始化帳戶號碼與初始餘額
        public Account(String accountNumber, double initialBalance) {
            this.accountNumber = accountNumber; // 設定帳戶號碼
            this.balance = initialBalance;      // 設定初始餘額
        }

        // 取得帳戶號碼
        public String getAccountNumber() {
            return accountNumber;
        }

        // 取得帳戶餘額
        public double getBalance() {
            return balance;
        }

        // 存款方法，將指定金額存入帳戶
        public void deposit(double amount) {
            // 檢查存款金額是否大於零
            if (amount > 0) {
                balance += amount; // 增加餘額
            } else {
                // 若金額不合法則丟出例外