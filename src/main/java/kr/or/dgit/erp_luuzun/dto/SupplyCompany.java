package kr.or.dgit.erp_luuzun.dto;

import java.util.List;

public class SupplyCompany {
	//공급회사
	private String compCode;
	private String compName;
	private Address compAddr;
	private String compTel;
	private boolean compIsExist;
	private List<Delivery> delivery;
}
