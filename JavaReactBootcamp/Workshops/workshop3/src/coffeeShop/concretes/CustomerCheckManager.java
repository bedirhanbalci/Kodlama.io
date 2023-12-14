package coffeeShop.concretes;

import coffeeShop.entities.Customer;
import coffeeShop.abstracts.CustomerCheckService;

public class CustomerCheckManager implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
}
