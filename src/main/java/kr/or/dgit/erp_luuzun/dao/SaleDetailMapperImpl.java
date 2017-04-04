package kr.or.dgit.erp_luuzun.dao;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.erp_luuzun.dto.SaleDetail;

public class SaleDetailMapperImpl implements SaleDetailMapper{
	private SqlSession sqlSession;
	private static final Log log = LogFactory.getLog(SaleDetailMapperImpl.class);
	private String nameSpace = "kr.or.dgit.erp_luuzun.dao.SaleDetailMapper.";

	public SaleDetailMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<SaleDetail> selectSaleDetailByAll() {
		log.debug("selectSaleDetailByAll()");
		return sqlSession.selectList(nameSpace + "selectSaleDetailByAll");
	}
}
