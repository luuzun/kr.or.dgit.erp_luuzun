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
}
