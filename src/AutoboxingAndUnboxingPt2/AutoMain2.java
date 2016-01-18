package AutoboxingAndUnboxingPt2;

/**
 * Created by Raffi on 1/17/2016.
 */
public class AutoMain2 {
    public static void main(String[] args) {

        Bank bank = new Bank("Wells Fargo");

        bank.addBranch("PRP");

        bank.addCustomer("PRP", "Raffi", 10000);
        bank.addCustomer("PRP", "Vahan", 15000);
        bank.addCustomer("PRP", "Mina", 17000);

        bank.addBranch("Ventura");
        bank.addCustomer("Ventura", "Daniel", 12000);

        bank.addCustomerTransaction("PRP", "Raffi", 12000);
        bank.addCustomerTransaction("PRP", "Raffi", 11000);
        bank.addCustomerTransaction("PRP", "Mina", 14000);

        bank.listCustomers("PRP", true);
        bank.listCustomers("Ventura", true);

    }
}

