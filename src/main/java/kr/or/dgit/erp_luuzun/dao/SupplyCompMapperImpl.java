package kr.or.dgit.erp_luuzun.dao;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.erp_luuzun.dto.Address;
import kr.or.dgit.erp_luuzun.dto.SupplyCompany;

public class SupplyCompMapperImpl implements SupplyCompMapper{
	private SqlSession sqlsession;
	private static final Log log = LogFactory.getLog(SupplyCompMapperImpl.class);
	private String namespace = "kr.or.dgit.erp_luuzun.dao.SupplyCompMapper.";
	
	public SupplyCompMapperImpl(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}

	@Override
	public List<SupplyCompany> selectSupplyCompByAll() {
		log.debug("selectSupplyCompByAll()");
		return sqlsession.selectList(namespace + "selectSupplyCompByAll");
	}
}
