package kr.or.dgit.erp_luuzun.dao;

import java.util.List;

import kr.or.dgit.erp_luuzun.dto.Client;

public interface ClientMapper {
	List<Client> selectClientByAll();
	Client selectClntByNo(Client client);
	int insetClntItem(Client client);
	int updateClntItem(Client client);
	int existClntItem(Client client);
}
