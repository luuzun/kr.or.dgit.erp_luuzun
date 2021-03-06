package kr.or.dgit.erp_luuzun.dto;

import java.util.List;

public class SupplyCompany {
	//공급회사
	private String compCode;
	private String compName;
	private Address address;
	private String compTel;
	private boolean compIsExist;
	private List<Delivery> delivery;

	public String getCompCode() {
		return compCode;
	}

	public void setCompCode(String compCode) {
		this.compCode = compCode;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getCompTel() {
		return compTel;
	}

	public void setCompTel(String compTel) {
		this.compTel = compTel;
	}

	public boolean isCompIsExist() {
		return compIsExist;
	}

	public void setCompIsExist(boolean compIsExist) {
		this.compIsExist = compIsExist;
	}

	public List<Delivery> getDelivery() {
		return delivery;
	}

	public void setDelivery(List<Delivery> delivery) {
		this.delivery = delivery;
	}

	@Override
	public String toString() {
		return String.format("%s, %s, %s, %s, %s, %s",
			compCode, compName, address, compTel, compIsExist, delivery);
	}
}
