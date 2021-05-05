package CampHW2;


public class Main {
	public static void main(String[] args) {
		baseCusomerManager manager = new starbucksCustomerManager(new customerCheckManager());
		Customer customer = new Customer ();
		customer.setId(1);
		customer.setFirstName("Ahmet Olgun");
		customer.setLastName("ÖZAD");
		customer.setNationalityId("55236685269");
		manager.save(customer);
	}
}
