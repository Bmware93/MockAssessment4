

public class App {
    public static void main(String[] args) throws Exception {
        SalesPerson fred = new SalesPerson("Fred", "Grand Circus Auto Sales");

        Customer jane = new Customer("Jane Vasquez", "555-5678");
        jane.addCall(20240601, "Scheduled visit for tomorrow");
        fred.addCustomer(jane);

        Customer jamal = new Customer("Jamal Smith", "555-1234");
        jamal.addCall(20240701, "Left phone message");
        fred.addCustomer(jamal);

        Customer bob = new Customer("Bob Johnson", "555-9012");
        bob.addCall(20240709, "Might be interested soon");
        fred.addCustomer(bob);

        Customer alice = new Customer("Alice Williams", "555-7890");
        alice.addCall(20240106, "Interested in purchasing");
        fred.addCustomer(alice);

        Customer tom = new Customer("Tom Davis", "555-2345");
        tom.addCall(20240106, "Purchased a vehicle");
        fred.addCustomer(tom);

        Customer emily = new Customer("Emily Wilson", "555-2345");
        emily.addCall(20240312, "Scheduled product demo");
        fred.addCustomer(emily);

        Customer next = fred.getNextCustomerToCall();
        System.out.println("Hello " + fred.getName() + " of " + fred.getCompany());
        //System.out.println(fred.getNextCustomerToCall());
    }
}
