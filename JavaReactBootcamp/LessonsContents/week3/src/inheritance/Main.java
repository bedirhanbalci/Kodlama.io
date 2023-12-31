package inheritance;

public class Main {
    public static void main(String[] args) {

        IndividualCustomer bedirhan = new IndividualCustomer();
        bedirhan.customerNumber = "12345";


        CorporateCustomer hepsiBurada = new CorporateCustomer();
        hepsiBurada.customerNumber = "78910";

        UnionCustomer abc = new UnionCustomer();
        abc.customerNumber = "99999";


        CustomerManager customerManager = new CustomerManager();
//        customerManager.add(hepsiBurada);
//        customerManager.add(bedirhan);
//        customerManager.add(abc);

        Customer[] customers = {bedirhan, hepsiBurada, abc};

        customerManager.addMultiple(customers);
    }
}