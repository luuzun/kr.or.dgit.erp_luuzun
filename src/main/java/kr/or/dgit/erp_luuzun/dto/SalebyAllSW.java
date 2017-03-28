package kr.or.dgit.erp_luuzun.dto;

import java.util.Date;

public class SalebyAllSW {
	//SW전체 판매현황
	private String groupName;
	private String swName;
	private String saleCode;
	private int saleAmount;
	private int totalSalePrice; //총 판매금액(단가X수량)
	private int total; //판매금액 합계
	private Date orderDate;
}
