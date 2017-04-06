package kr.or.dgit.erp_luuzun.dao;

import java.util.List;

import kr.or.dgit.erp_luuzun.dto.SupplyCompany;

public interface SupplyCompMapper {
	List<SupplyCompany> selectSupplyCompByAll();
	SupplyCompany selectCompByNo(SupplyCompany supplyCompany);
	int insertCompItem (SupplyCompany supplyCompany);
	int updateCompItem (SupplyCompany supplyCompany);
	int existCompItem (SupplyCompany supplyCompany);
}
