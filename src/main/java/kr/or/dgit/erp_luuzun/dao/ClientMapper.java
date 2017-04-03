package kr.or.dgit.erp_luuzun.dao;

import java.util.List;

import kr.or.dgit.erp_luuzun.dto.Category;
import kr.or.dgit.erp_luuzun.dto.Client;

public interface ClientMapper {
	List<Client> selectClientByAll();
}
