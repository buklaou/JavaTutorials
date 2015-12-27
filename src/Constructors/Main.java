package Constructors;

/**
 * Created by Raffi on 12/26/2015.
 */
public class Main {
    public static void main(String[] args) {

        //updates constructor
        Account raffisAccount = new Account(); //("12345", 0.00, "Raffi N", "myemail@raffi.com","(818)123-4567" );
        System.out.println(raffisAccount.getAccountNumber());
        System.out.println(raffisAccount.getBalance());

        raffisAccount.withdrawl(100.0);

        raffisAccount.depositeFunds(50.0);
        raffisAccount.withdrawl(100.0);

        raffisAccount.depositeFunds(51.0);
        raffisAccount.withdrawl(100.0);

    }
}
