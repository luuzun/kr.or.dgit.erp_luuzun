package kr.or.dgit.erp_luuzun.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.erp_luuzun.dao.AddrMapperImpl;
import kr.or.dgit.erp_luuzun.dto.Address;
import kr.or.dgit.erp_luuzun.util.MyBatisSqlSessionFactory;

public class AddrService {
	//private AddrService() {}
	public static final AddrService instance = new AddrService();
	public static AddrService getInstance() {
		return instance;
	}

	public List<Address> searchSido(Address address){
		try(SqlSession sqlsession = MyBatisSqlSessionFactory.openSession();){
			AddrMapperImpl addrMapperImpl = new AddrMapperImpl(sqlsession);
			return addrMapperImpl.searchSido(address);
		}
	}
}