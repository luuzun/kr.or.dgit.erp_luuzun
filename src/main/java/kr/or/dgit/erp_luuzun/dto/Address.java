package kr.or.dgit.erp_luuzun.dto;

public class Address {
	private String zipCode;
	private String sido;
	private String sigungu;
	private String doro;
	private int building1;
	private int building2;
	
	public Address() {}
	
	public Address(String string) {
		if (string != null) {
			String[] parts = string.split(" ");
			if (parts.length > 0)
				this.sido = parts[0];
			if (parts.length > 1)
				this.sigungu = parts[1];
			if (parts.length > 2)
				this.doro = parts[2];
		}
	}
	
	public Address(String sido, String doro) {
		this.sido = sido;
		this.doro = doro;
	}

	public Address(String zipCode, String sido, String sigungu, String doro) {
		this.zipCode = zipCode;
		this.sido = sido;
		this.sigungu = sigungu;
		this.doro = doro;
	}

	public Address(String zipCode, String sido, String sigungu, String doro, int building1, int building2) {
		this.zipCode = zipCode;
		this.sido = sido;
		this.sigungu = sigungu;
		this.doro = doro;
		this.building1 = building1;
		this.building2 = building2;
	}

	public String getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public String getSido() {
		return sido;
	}
	
	public void setSido(String sido) {
		this.sido = sido;
	}
	
	public String getSigungu() {
		return sigungu;
	}
	
	public void setSigungu(String sigungu) {
		this.sigungu = sigungu;
	}
	
	public String getDoro() {
		return doro;
	}
	
	public void setDoro(String doro) {
		this.doro = doro;
	}
	
	public int getBuilding1() {
		return building1;
	}
	
	public void setBuilding1(int building1) {
		this.building1 = building1;
	}
	
	public int getBuilding2() {
		return building2;
	}
	
	public void setBuilding2(int building2) {
		this.building2 = building2;
	}
	
	@Override
	public String toString() {
		return String.format("[%s] %s %s %s %s %s", zipCode,
				sido, sigungu, doro, building1, building2);
	}
	
	public Object[] toarray() {
		return new Object[]{ zipCode, sido + sigungu+ doro+  building1+ building2};
	}
}
