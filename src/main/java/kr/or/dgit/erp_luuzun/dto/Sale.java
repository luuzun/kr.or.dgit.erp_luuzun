package kr.or.dgit.erp_luuzun.dto;

import java.util.Date;

public class Sale {
	//소프트웨어 주문
	private String saleCode;
	private String clntName; 
	private String swName;
	private int saleAmount;
	private boolean isDeposit;
	private Date orderDate;
	private int supplyPrice;
	private int salePrice;
	private boolean saleIsExist;
}
