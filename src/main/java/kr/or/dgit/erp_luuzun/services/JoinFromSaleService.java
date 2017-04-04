package kr.or.dgit.erp_luuzun.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.erp_luuzun.dao.JoinFromSaleMapper;
import kr.or.dgit.erp_luuzun.dao.JoinFromSaleMapperImpl;
import kr.or.dgit.erp_luuzun.dto.JoinFromSale;
import kr.or.dgit.erp_luuzun.util.MyBatisSqlSessionFactory;
public class JoinFromSaleService {
	public static final JoinFromSaleService instance = new JoinFromSaleService();
	private JoinFromSaleService() {}
	public static JoinFromSaleService getInstance(){
		return instance;
	}
	
	public List<JoinFromSale> selectJoinFromSaleByAll() {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			JoinFromSaleMapper joinFromSaleMapper = new JoinFromSaleMapperImpl(sqlSession);
			return joinFromSaleMapper.selectJoinFromSaleByAll();
		} 
	}
}
