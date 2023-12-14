package coffeeShop;

import coffeeShop.abstracts.BaseCustomerManager;
import coffeeShop.adapters.MernisServiceAdapter;
import coffeeShop.concretes.StarbucksCustomerManager;
import coffeeShop.entities.Customer;


public class Main {
    public static void main(String[] args) {

        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

        customerManager.save(new Customer(1, "Bedirhan", "Balcı", 1999, "1111111111111"));

    }
}