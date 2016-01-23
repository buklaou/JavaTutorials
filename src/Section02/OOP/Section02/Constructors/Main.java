package Section02.OOP.Section02.Constructors;

/**
 * Created by Raffi on 12/26/2015.
 */
public class Main {
    public static void main(String[] args) {

      /*  //updates constructor
        Account raffisAccount = new Account(); //("12345", 0.00, "Raffi N", "myemail@raffi.com","(818)123-4567" );
        System.out.println(raffisAccount.getAccountNumber());
        System.out.println(raffisAccount.getBalance());

        raffisAccount.withdrawal(100.0);
        System.out.println();
        raffisAccount.depositFunds(50.0);
        raffisAccount.withdrawal(100.0);
        System.out.println();
        raffisAccount.depositFunds(51.0);
        raffisAccount.withdrawal(100.0);
        System.out.println();
        Account chrisAccount = new Account("Chris", "chris@email.com","12345");
        System.out.println(chrisAccount.getAccountNumber() + chrisAccount.getCustomerName());
    }*/

        //Calls class VipCustomer
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());
        System.out.println();
        VipCustomer person2 = new VipCustomer("Raffi", 25000.00);
        System.out.println(person2.getName());
        System.out.println(person2.getCreditLimit());
        System.out.println();
        VipCustomer person3 = new VipCustomer("Rafael", "rafael@email.com", 100.00);
        System.out.println(person3.getName());
        System.out.println(person3.getCreditLimit());
    }
}
