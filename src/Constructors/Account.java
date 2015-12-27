package Constructors;

/**
 * Created by Raffi on 12/26/2015.
 */
public class Account {

   private String number;
   private double balance;
   private String customerName;
   private String email;
   private String phoneNumber;

    //This is a constructor that has the same name of the class
    //stores default values by calling the second constructor
    public Account() {
        //this is a special this statement which calls the second constructor
        //must be the first line after the constructor is created
        this("5678", 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public Account(String customerName, String email, String phoneNumber) {

        this("9999", 100.55, customerName, email, phoneNumber);
        System.out.println("Empty constructor called");
    }

    //Main Constructor
    public Account(String number, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depositAmount) {

        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New Balance is " + this.balance);

    }

    public void withdrawal(double withdrawalAmount) {

        if(balance - withdrawalAmount < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }

    public String getAccountNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
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

    public void setAccountNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
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

}
