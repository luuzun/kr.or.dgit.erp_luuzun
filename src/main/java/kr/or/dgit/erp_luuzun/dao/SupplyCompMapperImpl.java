package kr.or.dgit.erp_luuzun.dao;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.erp_luuzun.dto.Address;
import kr.or.dgit.erp_luuzun.dto.SupplyCompany;

public class SupplyCompMapperImpl implements SupplyCompMapper{
	private SqlSession sqlSession;
	private static final Log log = LogFactory.getLog(SupplyCompMapperImpl.class);
	private String nameSpace = "kr.or.dgit.erp_luuzun.dao.SupplyCompMapper.";
	
	public SupplyCompMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<SupplyCompany> selectSupplyCompByAll() {
		log.debug("selectSupplyCompByAll()");
		return sqlSession.selectList(nameSpace + "selectSupplyCompByAll");
	}
}
