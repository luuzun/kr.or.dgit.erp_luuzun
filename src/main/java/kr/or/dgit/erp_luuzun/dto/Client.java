package kr.or.dgit.erp_luuzun.dto;

import java.util.List;

public class Client {
	//고객사
	private String clntCode;
	private String clntName;
	private Address clntAddr;
	private String clntTel;
	private boolean clntIsExist;
	private List<Sale> sale;
	
	public String getClntCode() {
		return clntCode;
	}
	
	public void setClntCode(String clntCode) {
		this.clntCode = clntCode;
	}
	
	public String getClntName() {
		return clntName;
	}
	
	public void setClntName(String clntName) {
		this.clntName = clntName;
	}
	
	public Address getClntAddr() {
		return clntAddr;
	}
	
	public void setClntAddr(Address clntAddr) {
		this.clntAddr = clntAddr;
	}
	
	public String getClntTel() {
		return clntTel;
	}
	
	public void setClntTel(String clntTel) {
		this.clntTel = clntTel;
	}
	
	public boolean isClntIsExist() {
		return clntIsExist;
	}
	
	public void setClntIsExist(boolean clntIsExist) {
		this.clntIsExist = clntIsExist;
	}
	
	public List<Sale> getSale() {
		return sale;
	}
	
	public void setSale(List<Sale> sale) {
		this.sale = sale;
	}

	@Override
	public String toString() {
		return String.format("%s, %s, %s, %s, %s, %s",
			clntCode, clntName, clntAddr, clntTel, clntIsExist, sale);
	}
}
