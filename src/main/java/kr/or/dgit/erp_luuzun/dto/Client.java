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
}
