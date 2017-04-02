package kr.or.dgit.erp_luuzun.dao;

import java.util.List;

import kr.or.dgit.erp_luuzun.dto.Address;

public interface AddrMapper {
	List<Address> searchSido(Address address);
}
