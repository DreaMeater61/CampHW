package CampHW2;

public abstract class baseCusomerManager {
	
	public void save(Customer customer) {
		System.out.println("Database kayd� yap�ld� : " + customer.getFirstName() + " " +  customer.getLastName());
		
	}
	

}
