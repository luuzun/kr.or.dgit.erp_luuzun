package kr.or.dgit.erp_luuzun.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.erp_luuzun.dao.SalesMapper;
import kr.or.dgit.erp_luuzun.dao.SalesMapperImpl;
import kr.or.dgit.erp_luuzun.dao.SupplyCompMapper;
import kr.or.dgit.erp_luuzun.dao.SupplyCompMapperImpl;
import kr.or.dgit.erp_luuzun.dto.Sale;
import kr.or.dgit.erp_luuzun.dto.SupplyCompany;
import kr.or.dgit.erp_luuzun.util.MyBatisSqlSessionFactory;
public class SupplyCompService {
	public static final SupplyCompService instance = new SupplyCompService();
	private SupplyCompService() {}
	public static SupplyCompService getInstance(){
		return instance;
	}
	
	public List<SupplyCompany> selectSupplyCompByAll() {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			SupplyCompMapper supplyCompMapper = new SupplyCompMapperImpl(sqlSession);
			return supplyCompMapper.selectSupplyCompByAll();
		} 
	}
}
