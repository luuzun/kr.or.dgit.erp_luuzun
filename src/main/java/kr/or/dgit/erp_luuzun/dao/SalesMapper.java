package kr.or.dgit.erp_luuzun.dao;

import java.util.List;
import kr.or.dgit.erp_luuzun.dto.Sale;

public interface SalesMapper {
	int insertSales(Sale sale);
	Sale selectSales(Sale sale);
	List<Sale> selectSalesByAll();
	int updateSales(Sale sale);
	int deleteSales(Sale sale);
}
