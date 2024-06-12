
public class SafeCar {
	
	public SafeCar() {
	//Creation Of Customers
	Customer Customer1 = new Customer("Maria", "Papadopoulou", "2310264368","maria.papadopoulou@gmail.com", "AO79432");
	Customer Customer2 = new Customer("Evanthia","Papagianni","2310245368","evanthia.papagianni@gmail.com","AO77813");	
	Customer Customer3 = new Customer("Vasilis","Karagiannis","2310245668","ioannis.karagiannis@gmail.com","AO45698");
			
	//Creation of Vehicle
	Vehicle Vehicle1 = new Vehicle("Mercedes", "GLC", "XKP8923", "2020","7C3FR76A515072256");
	Vehicle Vehicle2 = new Vehicle("Subaru", "Forester", "NII4269", "2018","7C3FR76A555071465");
	Vehicle Vehicle3 = new Vehicle("Ford", "Ranger", "KOH4681", "2022","7C3FR76A55504645");
			
	//Creation of Insurance Policies
	InsurancePolicy InsurancePolicy1 = new InsurancePolicy("ΜI93", "Mikti asfalisi", "6");
	InsurancePolicy InsurancePolicy2 = new InsurancePolicy("B56", "Basiki asfalisi", "6");
	InsurancePolicy InsurancePolicy3 = new InsurancePolicy("O58", "Me odik", "6");
	
	//Creation of Insurance Contracts
	InsuranceContract InsuranceContract1 = new InsuranceContract(Customer1, Vehicle1, InsurancePolicy2, 60);
	InsuranceContract InsuranceContract2 = new InsuranceContract(Customer2, Vehicle2, InsurancePolicy1, 120);
	InsuranceContract InsuranceContract3 = new InsuranceContract(Customer2	, Vehicle3, InsurancePolicy3, 80);
		
	InsuranceContract1.printData();
	InsuranceContract2.printData();
	InsuranceContract3.printData();
	
	Customer1.printData();
	Customer2.printData();
	Customer3.printData();
	}
}
