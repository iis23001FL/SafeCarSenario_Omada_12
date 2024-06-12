import java.util.ArrayList;

public class Vehicle {
	private static ArrayList<Vehicle> VehicleCatalogue = new ArrayList<Vehicle>();
	private String Marka;
	private String Modelo;
	private String Year;
	private String Pinakida;
	private String Arithmos_Plaisiou;
	
	public Vehicle(String aMarka, String aModelo, String aPinakida, String aYear, String anArithmos_Plaisiou) {
		//Searches the Vehicle Catalog to see if there exists another vehicle with the same plaisio number.
		//If there is any, then the new vehicle isn't added to the catalog.
		if (SearchVehicle(anArithmos_Plaisiou) == true) {
			System.out.println("A vehicle with the same plaisio number already exists in the system");
		}
		else if(SearchVehicle(anArithmos_Plaisiou) == false){
			Marka = aMarka;
			Modelo = aModelo;
			Year = aYear;
			Pinakida = aPinakida;
			Arithmos_Plaisiou = anArithmos_Plaisiou;
			VehicleCatalogue.add(this);
		}
	}
	
	public boolean SearchVehicle(String anArithmos_Plaisiou){
		//Searches the Vehicle Catalog to see if there exists another vehicle with the same plaisio number.
		int i;
		boolean found = false;
		
		for(i = 0; i < VehicleCatalogue.size(); i++) {
			if(VehicleCatalogue.get(i).Arithmos_Plaisiou.equals(anArithmos_Plaisiou)) {
				found = true;
			}
		}
		
		return found;
	}

	public String getMarka() {
		return Marka;
	}

	public void setMarka(String marka) {
		Marka = marka;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getYear() {
		return Year;
	}

	public void setYear(String year) {
		Year = year;
	}

	public String getPinakida() {
		return Pinakida;
	}

	public void setPinakida(String pinakida) {
		Pinakida = pinakida;
	}

	public String getArithmos_Plaisiou() {
		return Arithmos_Plaisiou;
	}

	public void setArithmos_Plaisiou(String arithmos_Plaisiou) {
		Arithmos_Plaisiou = arithmos_Plaisiou;
	}
	
	
}
