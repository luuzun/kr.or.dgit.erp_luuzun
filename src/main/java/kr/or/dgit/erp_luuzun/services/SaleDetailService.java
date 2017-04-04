package kr.or.dgit.erp_luuzun.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.erp_luuzun.dao.SaleDetailMapper;
import kr.or.dgit.erp_luuzun.dao.SaleDetailMapperImpl;
import kr.or.dgit.erp_luuzun.dto.SaleDetail;
import kr.or.dgit.erp_luuzun.util.MyBatisSqlSessionFactory;
public class SaleDetailService {
	public static final SaleDetailService instance = new SaleDetailService();
	private SaleDetailService() {}
	public static SaleDetailService getInstance(){
		return instance;
	}
	
	public List<SaleDetail> selectSaleDetailByAll() {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			SaleDetailMapper saleDetailMapper = new SaleDetailMapperImpl(sqlSession);
			return saleDetailMapper.selectSaleDetailByAll();
		} 
	}
}
