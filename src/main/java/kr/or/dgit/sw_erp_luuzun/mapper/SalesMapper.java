package kr.or.dgit.sw_erp_luuzun.mapper;

import java.util.List;
import kr.or.dgit.erp_luuzun.dto.Sale;

public interface SalesMapper {
	int insertSales(Sale sale);
	Sale selectSales(Sale sale);
	List<Sale> selectSalesByAll();
	int updateSales(Sale sale);
	int deleteSales(Sale sale);
}
