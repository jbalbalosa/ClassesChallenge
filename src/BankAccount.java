package PACKAGE_NAME;

public class BankAccount {

    private String AccountNumber = "001-00-00";
    private double AccountBalance = 0;
    private String CustomerName = "No name";
    private String email = "noemail";
    private String PhoneNumber = "000-000-000";

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.AccountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.AccountBalance = accountBalance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        this.CustomerName = customerName;
    }

    public String email(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }

    public void deposit(double amount){
        this.AccountBalance += amount;
        System.out.println("Deposit has been successful \n" +
                "Your new account balance is:" + this.AccountBalance);
    }

    public void withdraw(double amount) {
        if (amount > this.AccountBalance){
            System.out.println("Withdrawal not allowed. You only have " + this.AccountBalance + " in your account");

        } else {
            this.AccountBalance -= amount;
            System.out.println("Withdrawal has been successful \n" +
                    "Your new account balance is:" + this.AccountBalance);
        }
    }

    public  void displayAccountDetails(){
        System.out.println("Customer Name: " + this.CustomerName +
                "\nAccount Number: " + this.AccountNumber +
                "\nAccount Balance: " + this.AccountBalance +
                "\nPhone Number: " + this.PhoneNumber +
                "\nEmail: " + this.email);

    }
}

