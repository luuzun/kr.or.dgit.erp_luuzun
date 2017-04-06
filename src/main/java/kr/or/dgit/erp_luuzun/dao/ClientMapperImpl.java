package kr.or.dgit.erp_luuzun.dao;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.erp_luuzun.dto.Client;

public class ClientMapperImpl implements ClientMapper{
	private SqlSession sqlSession;
	private static final Log log = LogFactory.getLog(ClientMapperImpl.class);
	private String nameSpace = "kr.or.dgit.erp_luuzun.dao.ClientMapper.";

	public ClientMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Client> selectClientByAll() {
		log.debug("selectClientByAll()");
		return sqlSession.selectList(nameSpace + "selectClientByAll");
	}

	@Override
	public Client selectClntByNo(Client client) {
		log.debug("selectClntByNo()");
		return sqlSession.selectOne(nameSpace + "selectClntByNo",client);
	}

	@Override
	public int insetClntItem(Client client) {
		log.debug("insetClntItem()");
		return sqlSession.insert(nameSpace + "insetClntItem",client);
	}

	@Override
	public int updateClntItem(Client client) {
		log.debug("updateClntItem()");
		return sqlSession.update(nameSpace + "updateClntItem",client);
	}

	@Override
	public int existClntItem(Client client) {
		log.debug("existClntItem()");
		return sqlSession.update(nameSpace + "existClntItem",client);
	}
}
