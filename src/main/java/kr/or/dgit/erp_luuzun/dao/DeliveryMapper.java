package kr.or.dgit.erp_luuzun.dao;

import java.util.List;

import kr.or.dgit.erp_luuzun.dto.Delivery;

public interface DeliveryMapper {
	List<Delivery> selectDeliveryByAll();
}
