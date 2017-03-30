package kr.or.dgit.erp_luuzun.mapper;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.erp_luuzun.dto.Sale;

public class SalesMapperImpl implements SalesMapper{

	private String nameSpace = "kr.or.dgit.erp_luuzun.mapper.SalesMapper."; //SalesMapper.xml의 namespace
	private SqlSession sqlSession;
	private static final Log log = LogFactory.getLog(SalesMapperImpl.class);
	
	public SalesMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	@Override
	public int insertSales(Sale sale) {
		log.debug("insertSales()");
		return sqlSession.insert(nameSpace+"insertSales", sale);
	}
	@Override
	public Sale selectSales(Sale sale) {
		log.debug("selectSales()");
		return sqlSession.selectOne(nameSpace+"selectSales", sale);

	}

	@Override
	public List<Sale> selectSalesByAll() {
		log.debug("selectSalesByAll()");
		return sqlSession.selectList(nameSpace+"selectSalesByAll");
	}

	@Override
	public int updateSales(Sale sale) {
		log.debug("updateSales()");
		return sqlSession.update(nameSpace+"updateSales", sale);
	}

	@Override
	public int deleteSales(Sale sale) {
		log.debug("deleteSales()");
		return sqlSession.delete(nameSpace+"deleteSales", sale);
	}
}
