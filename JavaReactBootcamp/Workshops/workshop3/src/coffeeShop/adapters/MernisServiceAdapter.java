package coffeeShop.adapters;

import coffeeShop.abstracts.CustomerCheckService;
import coffeeShop.entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return false;
    }
}
