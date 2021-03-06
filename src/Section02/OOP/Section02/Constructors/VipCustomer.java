package Section02.OOP.Section02.Constructors;

/**
 * @author Raffi
 */
public class VipCustomer {
    private String name;
    private String email;
    private double creditLimit;

    //Main Constructor
    public VipCustomer(String name, String email, double creditLimit) {

        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;

    }

    public VipCustomer(String name, double creditLimit) {
        this(name, "unknown@email.com", creditLimit);
    }

    public VipCustomer() {
        this("Default name", "Default Email", 50000.00);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
