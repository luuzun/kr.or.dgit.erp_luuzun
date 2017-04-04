package kr.or.dgit.erp_luuzun.dao;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.erp_luuzun.dto.Sale;

public class SaleMapperImpl implements SaleMapper{
	private SqlSession sqlSession;
	private static final Log log = LogFactory.getLog(SaleMapperImpl.class);
	private String nameSpace = "kr.or.dgit.erp_luuzun.dao.SaleMapper.";

	public SaleMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Sale> selectSaleByAll() {
		log.debug("selectSaleByAll()");
		return sqlSession.selectList(nameSpace + "selectSaleByAll");
	}
}
