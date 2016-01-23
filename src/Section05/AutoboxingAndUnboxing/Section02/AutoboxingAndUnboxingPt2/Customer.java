package Section05.AutoboxingAndUnboxing.Section02.AutoboxingAndUnboxingPt2;

import java.util.ArrayList;

/**
 * Created by Raffi on 1/17/2016.
 */
public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
