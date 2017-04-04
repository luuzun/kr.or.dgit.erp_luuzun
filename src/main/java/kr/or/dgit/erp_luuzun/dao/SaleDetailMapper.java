package kr.or.dgit.erp_luuzun.dao;

import java.util.List;

import kr.or.dgit.erp_luuzun.dto.Category;
import kr.or.dgit.erp_luuzun.dto.Client;
import kr.or.dgit.erp_luuzun.dto.SaleDetail;

public interface SaleDetailMapper {
	List<SaleDetail> selectSaleDetailByAll();
}
