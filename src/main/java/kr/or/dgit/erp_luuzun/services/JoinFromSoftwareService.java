package kr.or.dgit.erp_luuzun.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.erp_luuzun.dao.JoinFromSoftwareMapper;
import kr.or.dgit.erp_luuzun.dao.JoinFromSoftwareMapperImpl;
import kr.or.dgit.erp_luuzun.dto.JoinFromSoftware;
import kr.or.dgit.erp_luuzun.util.MyBatisSqlSessionFactory;
public class JoinFromSoftwareService {
	public static final JoinFromSoftwareService instance = new JoinFromSoftwareService();
	private JoinFromSoftwareService() {}
	public static JoinFromSoftwareService getInstance(){
		return instance;
	}
	
	public List<JoinFromSoftware> selectJoinFromSoftwareByAll() {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			JoinFromSoftwareMapper joinFromSoftwareMapper = new JoinFromSoftwareMapperImpl(sqlSession);
			return joinFromSoftwareMapper.selectJoinFromSoftwareByAll();
		} 
	}
}
