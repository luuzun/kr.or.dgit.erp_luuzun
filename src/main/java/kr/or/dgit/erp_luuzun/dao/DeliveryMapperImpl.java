package kr.or.dgit.erp_luuzun.dao;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.erp_luuzun.dto.Address;
import kr.or.dgit.erp_luuzun.dto.Delivery;
import kr.or.dgit.erp_luuzun.dto.SupplyCompany;

public class DeliveryMapperImpl implements DeliveryMapper{
	private SqlSession sqlsession;
	private static final Log log = LogFactory.getLog(DeliveryMapperImpl.class);
	private String namespace = "kr.or.dgit.erp_luuzun.dao.DeliveryMapper.";
	
	public DeliveryMapperImpl(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}

	@Override
	public List<Delivery> selectDeliveryByAll() {
		log.debug("selectDeliveryByAll()");
		return sqlsession.selectList(namespace + "selectDeliveryByAll");
	}
}
