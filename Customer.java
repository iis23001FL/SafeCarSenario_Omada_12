import java.util.ArrayList;

public class Customer {
	private static ArrayList<Customer> CustomerCatalog = new ArrayList<Customer>();
	private String Name;
	private String LastName;
	private String Phone;
	private String Email;
	private String Arithmos_Taftotitas;
	
	public Customer(String aName, String aLastName, String aPhone, String anEmail, String anArithmos_Taftotitas) {
		//Searches the Customer Catalog to see if there exists another customer with the same id number.
		//If there is any, then the new customer isn't added to the catalog.
		if (SearchCustomer(anArithmos_Taftotitas) == true) {
			System.out.println("A customer with the same ID number already exists in the system");
		}
		else if(SearchCustomer(anArithmos_Taftotitas) == false){
			Name = aName;
			LastName = aLastName;
			Phone = aPhone;
			Email = anEmail;
			Arithmos_Taftotitas = anArithmos_Taftotitas;
			CustomerCatalog.add(this);
		}
	}
		
	public boolean SearchCustomer(String anArithmos_Taftotitas){
		//Searches the Customer Catalog to see if there exists another customer with the same id number.
		int i;
		boolean found = false;
		
		for(i = 0; i < CustomerCatalog.size(); i++) {
			if(CustomerCatalog.get(i).Arithmos_Taftotitas.equals(anArithmos_Taftotitas)) {
				found = true;
			}
		}
		
		return found;
	}
	
	public void printData() {
		double cost =0;
		int i;
		
		System.out.print(Name+ " " +LastName+ " has the following vehicles insured: ");
		
		for(i = 0; i< InsuranceContract.getICCatalog().size(); i++) {
			if(InsuranceContract.getICCatalog().get(i).getaCustomer().Arithmos_Taftotitas == this.Arithmos_Taftotitas) {
				System.out.print(InsuranceContract.getICCatalog().get(i).getaVehicle().getPinakida()+ " ,");
				cost += InsuranceContract.getICCatalog().get(i).getCost();
				}
		}
		System.out.println("and the total cost of insurance is: " +cost+ " euros.");
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getArithmos_Taftotitas() {
		return Arithmos_Taftotitas;
	}

	public void setArithmos_Taftotitas(String arithmos_Taftotitas) {
		Arithmos_Taftotitas = arithmos_Taftotitas;
	}
	
}
