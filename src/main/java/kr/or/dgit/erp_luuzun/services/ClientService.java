package kr.or.dgit.erp_luuzun.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.erp_luuzun.dao.ClientMapper;
import kr.or.dgit.erp_luuzun.dao.ClientMapperImpl;
import kr.or.dgit.erp_luuzun.dto.Client;
import kr.or.dgit.erp_luuzun.util.MyBatisSqlSessionFactory;
public class ClientService {
	public static final ClientService instance = new ClientService();
	private ClientService() {}
	public static ClientService getInstance(){
		return instance;
	}
	
	public List<Client> selectClientByAll() {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			ClientMapper clientMapper = new ClientMapperImpl(sqlSession);
			return clientMapper.selectClientByAll();
		} 
	}
	
	public Client selectByNoClnt(Client client) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			ClientMapper clientMapper = new ClientMapperImpl(sqlSession);
			return clientMapper.selectClntByNo(client);
		} 
	}

	public int insetClntItem(Client client) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			ClientMapper clientMapper = new ClientMapperImpl(sqlSession);
			int res= clientMapper.insetClntItem(client);
			sqlSession.commit();
			return res;
		} 
	}

	public int updateClntItem(Client client) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			ClientMapper clientMapper = new ClientMapperImpl(sqlSession);
			int res= clientMapper.updateClntItem(client);
			sqlSession.commit();
			return res;
		} 
	}

	public int existClntItem(Client client) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			ClientMapper clientMapper = new ClientMapperImpl(sqlSession);
			int res= clientMapper.existClntItem(client);
			sqlSession.commit();
			return res;
		} 
	}
}
