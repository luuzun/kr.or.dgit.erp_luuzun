package kr.or.dgit.erp_luuzun.dao;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.erp_luuzun.dto.Address;

public class AddrMapperImpl implements AddrMapper{
	private SqlSession sqlsession;
	private static final Log log = LogFactory.getLog(AddrMapperImpl.class);
	private String namespace = "kr.or.dgit.erp_luuzun.dao.AddrMapper.";
	
	public AddrMapperImpl(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}

	@Override
	public List<Address> searchSido(Address address) {
		log.debug("searchSido()");
		return sqlsession.selectList(namespace + "searchSido", address);
	}
}
