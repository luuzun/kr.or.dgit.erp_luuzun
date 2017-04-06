package kr.or.dgit.erp_luuzun.dao;

import java.util.List;

import kr.or.dgit.erp_luuzun.dto.Software;

public interface SoftwareMapper {
	List<Software> selectSoftwareByAll();
}
