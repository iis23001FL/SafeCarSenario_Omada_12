
public class InsurancePolicy {
	private String kodikos_paketou;
	private String perigrafi;
	private String diarkeia;
	
	public InsurancePolicy(String aKodikos_paketou, String aPerigrafi, String aDiarkeia) {
		kodikos_paketou = aKodikos_paketou;
		perigrafi = aPerigrafi;
		diarkeia = aDiarkeia;
	}

	public String getKodikos_paketou() {
		return kodikos_paketou;
	}

	public void setKodikos_paketou(String kodikos_paketou) {
		this.kodikos_paketou = kodikos_paketou;
	}

	public String getPerigrafi() {
		return perigrafi;
	}

	public void setPerigrafi(String perigrafi) {
		this.perigrafi = perigrafi;
	}

	public String getDiarkeia() {
		return diarkeia;
	}

	public void setDiarkeia(String diarkeia) {
		this.diarkeia = diarkeia;
	}
	
	
}
