package kr.or.dgit.erp_luuzun.dto;

import java.util.Date;

public class TradeSaleList {
	//거래명세서
	private String compCode;
	private String compName;
	private Date orderDate;
	private String clntCode;
	private String clntName;
	private String swCode;
	private String swName;
	private int salePrice;
	private int saleAmount;
	private int totalSalePrice;
	private int tax;
	private int taxSalePrice;
	private int sumOftotalSalePrice;
}
