package kr.or.dgit.erp_luuzun.dao;

import java.util.List;

import kr.or.dgit.erp_luuzun.dto.Category;

public interface CategoryMapper {
	List<Category> selectCategoryByAll();
}
