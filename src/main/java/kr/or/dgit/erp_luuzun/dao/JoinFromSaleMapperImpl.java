package kr.or.dgit.erp_luuzun.dao;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.erp_luuzun.dto.Address;
import kr.or.dgit.erp_luuzun.dto.JoinFromSale;
import kr.or.dgit.erp_luuzun.dto.SupplyCompany;

public class JoinFromSaleMapperImpl implements JoinFromSaleMapper{
	private SqlSession sqlSession;
	private static final Log log = LogFactory.getLog(JoinFromSaleMapperImpl.class);
	private String nameSpace = "kr.or.dgit.erp_luuzun.dao.JoinFromSaleMapper.";
	
	public JoinFromSaleMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<JoinFromSale> selectJoinFromSaleByAll() {
		log.debug("selectJoinFromSaleByAll()");
		return sqlSession.selectList(nameSpace + "selectJoinFromSaleByAll");
	}
}
