package CampHW2;

public class Customer {
	private int id;
	private int companyId;
	private String firstName;
	private String lastName;
	public int dateOfBirth;
	public String nationalityId;
	
	public Customer()
	{
		
	}
	
	public Customer(int id, int companyId,String firstName, String lastName, int dateOfBirth, String nationalityId) {
		super();
		this.id = id;
		this.companyId= companyId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}


}
