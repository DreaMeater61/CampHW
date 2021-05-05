package CampHW2;

public abstract class baseCusomerManager {
	
	public void save(Customer customer) {
		System.out.println("Database kaydý yapýldý : " + customer.getFirstName() + " " +  customer.getLastName());
		
	}
	

}
