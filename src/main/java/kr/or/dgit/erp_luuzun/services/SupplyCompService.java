package kr.or.dgit.erp_luuzun.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.erp_luuzun.dao.SupplyCompMapper;
import kr.or.dgit.erp_luuzun.dao.SupplyCompMapperImpl;
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
	

	public SupplyCompany selectCompByNo(SupplyCompany supplyCompany) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			SupplyCompMapper supplyCompMapper = new SupplyCompMapperImpl(sqlSession);
			return supplyCompMapper.selectCompByNo(supplyCompany);
		} 
	}

	public int insertCompItem(SupplyCompany supplyCompany) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			SupplyCompMapper supplyCompMapper = new SupplyCompMapperImpl(sqlSession);
			int res= supplyCompMapper.insertCompItem(supplyCompany);
			sqlSession.commit();
			return res;
		} 
	}

	public int updateCompItem(SupplyCompany supplyCompany) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			SupplyCompMapper supplyCompMapper = new SupplyCompMapperImpl(sqlSession);
			int res= supplyCompMapper.updateCompItem(supplyCompany);
			sqlSession.commit();
			return res;
		} 
	}

	public int existCompItem(SupplyCompany supplyCompany) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			SupplyCompMapper supplyCompMapper = new SupplyCompMapperImpl(sqlSession);
			int res= supplyCompMapper.existCompItem(supplyCompany);
			sqlSession.commit();
			return res;
		} 
	}
}
