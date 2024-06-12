import java.util.ArrayList;

public class InsuranceContract {
	private static ArrayList<InsuranceContract> ICCatalog = new ArrayList<InsuranceContract>();
	private Vehicle aVehicle;
	private Customer aCustomer;
	private InsurancePolicy anInsurancePolicy;
	private double Cost;
	
	public InsuranceContract(Customer aCustomer, Vehicle aVehicle, InsurancePolicy anInsurancePolicy, double cost) {
		super();
		this.aVehicle = aVehicle;
		this.aCustomer = aCustomer;
		this.anInsurancePolicy = anInsurancePolicy;
		Cost = cost;
		
		ICCatalog.add(this);
	}	
	
	public void printData() {
		System.out.println("This insurance is for " +aCustomer.getName()+ " with the vehicle whose license plate is: " +aVehicle.getPinakida()+ ", the insurance policy is " +anInsurancePolicy.getPerigrafi()+ " and it costs " +Cost+ " euros.");
	}

	public static ArrayList<InsuranceContract> getICCatalog() {
		return ICCatalog;
	}

	public static void setICCatalog(ArrayList<InsuranceContract> iCCatalog) {
		ICCatalog = iCCatalog;
	}

	public Vehicle getaVehicle() {
		return aVehicle;
	}

	public void setaVehicle(Vehicle aVehicle) {
		this.aVehicle = aVehicle;
	}

	public Customer getaCustomer() {
		return aCustomer;
	}

	public void setaCustomer(Customer aCustomer) {
		this.aCustomer = aCustomer;
	}

	public InsurancePolicy getAnInsurancePolicy() {
		return anInsurancePolicy;
	}

	public void setAnInsurancePolicy(InsurancePolicy anInsurancePolicy) {
		this.anInsurancePolicy = anInsurancePolicy;
	}

	public double getCost() {
		return Cost;
	}

	public void setCost(double cost) {
		Cost = cost;
	}	
	
	
}
