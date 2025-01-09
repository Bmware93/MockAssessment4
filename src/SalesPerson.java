import java.util.ArrayList;

public class SalesPerson {
    private String name;
    private String company;
    private ArrayList<Customer> customers;

    public String getName() {
        return name;
    }
    public String getCompany() {
        return company;
    }
    public SalesPerson(String name, String company) {
        this.name = name;
        this.company = company;
        customers = new ArrayList<>();
    }
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    public Customer getNextCustomerToCall() {
        Customer nexCustomer = null;
        int oldestDate = 999999999;

        for(Customer customer: customers) {
            Call lastCall = customer.getLastCall();
            if(lastCall != null && lastCall.getDate() < oldestDate) {
                oldestDate = lastCall.getDate();
                nexCustomer = customer;
            }
        }
        return nexCustomer;
    }
}
