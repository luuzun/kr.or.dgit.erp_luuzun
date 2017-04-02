package kr.or.dgit.erp_luuzun.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.erp_luuzun.dao.SalesMapper;
import kr.or.dgit.erp_luuzun.dao.SalesMapperImpl;
import kr.or.dgit.erp_luuzun.dto.Sale;
import kr.or.dgit.erp_luuzun.util.MyBatisSqlSessionFactory;
public class SalesService {
	public static final SalesService instance = new SalesService();
	private SalesService() {}
	public static SalesService getInstance(){
		return instance;
	}
	
	public int insertSales(Sale sale) {
		int res = -1;
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			SalesMapper salesMapper = new SalesMapperImpl(sqlSession);
			res = salesMapper.insertSales(sale);
			sqlSession.commit();
		} 
		return res;
	}

	public Sale selectSales(Sale sale) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			SalesMapper salesMapper = new SalesMapperImpl(sqlSession);
			return salesMapper.selectSales(sale);
		} 
	}
	
	public List<Sale> selectSalesByAll() {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			SalesMapper salesMapper = new SalesMapperImpl(sqlSession);
			return salesMapper.selectSalesByAll();
		} 
	}
	
	public int updateSales(Sale sale) {
		int res = -1;
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			SalesMapper salesMapper = new SalesMapperImpl(sqlSession);
			res = salesMapper.updateSales(sale);
			sqlSession.commit();
		} 
		return res;
	}

	public int deleteSales(Sale sale) {
		int res = -1;
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			SalesMapper salesMapper = new SalesMapperImpl(sqlSession);
			res = salesMapper.deleteSales(sale);
			sqlSession.commit();
		} 
		return res;
	}
}
