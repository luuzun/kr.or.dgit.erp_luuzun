package kr.or.dgit.erp_luuzun.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.erp_luuzun.dao.SoftwareMapper;
import kr.or.dgit.erp_luuzun.dao.SoftwareMapperImpl;
import kr.or.dgit.erp_luuzun.dto.Software;
import kr.or.dgit.erp_luuzun.util.MyBatisSqlSessionFactory;
public class SoftwareService {
	public static final SoftwareService instance = new SoftwareService();
	private SoftwareService() {}
	public static SoftwareService getInstance(){
		return instance;
	}
	
	public List<Software> selectSoftwareByAll() {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			SoftwareMapper softwareMapper = new SoftwareMapperImpl(sqlSession);
			return softwareMapper.selectSoftwareByAll();
		} 
	}
}
