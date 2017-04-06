package kr.or.dgit.erp_luuzun.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.erp_luuzun.dao.DeliveryMapper;
import kr.or.dgit.erp_luuzun.dao.DeliveryMapperImpl;
import kr.or.dgit.erp_luuzun.dto.Delivery;
import kr.or.dgit.erp_luuzun.util.MyBatisSqlSessionFactory;
public class DeliveryService {
	public static final DeliveryService instance = new DeliveryService();
	private DeliveryService() {}
	public static DeliveryService getInstance(){
		return instance;
	}
	
	public List<Delivery> selectDeliveryByAll() {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			DeliveryMapper deliveryMapper = new DeliveryMapperImpl(sqlSession);
			return deliveryMapper.selectDeliveryByAll();
		} 
	}
}
