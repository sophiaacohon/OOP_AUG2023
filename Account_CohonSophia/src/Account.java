/*Account Assignment
 * Made by: Sophia Ann Cohon
 * Date: September 9, 2023
 * Program Description: create a class that allows user to withdraw and deposit money from bank account based on slides 25-26 on ppt
*/
public class Account {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account(String accountNumber, double accountBalance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Account [accountNumber=" + accountNumber + ", accountBalance=" + accountBalance + ", customerName="
                + customerName + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
    }

    public void deposit(double amountDeposit){
        System.out.println("Depositing PHP " + amountDeposit);
        this.accountBalance += amountDeposit;
        System.out.println("Your current balance is PHP " + this.accountBalance);
    }

    public double withdraw(double amountWithdraw){
        System.out.println("Withdrawing PHP " + amountWithdraw);
        double tempAmt = this.accountBalance - amountWithdraw;
        if(tempAmt<0){
            System.out.println("Withdrawal will result in negative balance. Withdraw failed.");
            System.out.println("Your current balance is PHP " + this.accountBalance);
        }
        else{
            this.accountBalance -= amountWithdraw;
            System.out.println("You have withdrawn PHP " + amountWithdraw);
            System.out.println("Your current balance is PHP " + this.accountBalance);
        }
        return amountWithdraw;
    }

    public static void main(String[] args) {
        Account myAccount = new Account("123 456 789", 3000.00, "Sophia Ann Cohon", "sophiaacohon@email.com", "09061234567");
        System.out.println(myAccount);
        myAccount.withdraw(4000.00);
        myAccount.deposit(500.00);
        myAccount.deposit(1000.00);
        myAccount.withdraw(456.75);
        myAccount.withdraw(68.99);
    }
}
