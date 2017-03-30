package kr.or.dgit.erp_luuzun.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.erp_luuzun.dto.Sale;
import kr.or.dgit.erp_luuzun.mapper.SalesMapper;
import kr.or.dgit.erp_luuzun.mapper.SalesMapperImpl;
import kr.or.dgit.erp_luuzun.util.MyBatisSqlSessionFactory;


public class SalesService {

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
