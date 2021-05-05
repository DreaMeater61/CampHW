package CampHW2;

public class starbucksCustomerManager extends baseCusomerManager{


	private customerCheckServices customerCheckService;
	
	
	
	public starbucksCustomerManager(customerCheckServices customerCheckService) {
		
		this.customerCheckService = customerCheckService;
		
	}
	
	@Override
	public void save(Customer customer) {
		
		if (customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("Ger�ek ki�i de�il");
		}
		
	}
	
}
