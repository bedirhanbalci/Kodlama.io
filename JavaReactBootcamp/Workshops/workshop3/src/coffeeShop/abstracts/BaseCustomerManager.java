package coffeeShop.abstracts;

import coffeeShop.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

    public void save(Customer customer) {
        System.out.println(customer.getFirstName() + " saved to db");
    }
}
