public class Main {
    public static void main(String[] args) {
                BankAccount ba = new BankAccount();

        ba.setAccountNumber("123456");
        ba.setAccountBalance(200);
        ba.setCustomerName("Jeff");
        ba.setPhoneNumber("680-7782572");
        ba.setEmail("jeffrey@surangel.com");

        ba.displayAccountDetails();
//
//        ba.deposit(20000);
//        ba.withdraw(50);
//        ba.withdraw(50);
//        ba.deposit(75);
//        ba.deposit(300);
        ba.withdraw(300);
    }
}
