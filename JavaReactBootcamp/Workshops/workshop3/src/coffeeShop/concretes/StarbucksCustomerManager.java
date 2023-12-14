package coffeeShop.concretes;

import coffeeShop.abstracts.BaseCustomerManager;
import coffeeShop.entities.Customer;
import coffeeShop.abstracts.CustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomerManager {

    private final CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) {

        if (this.customerCheckService.checkIfRealPerson(customer)) {
            super.save(customer);
        } else {
            System.out.println("Not a valid person!");
        }

    }
}
