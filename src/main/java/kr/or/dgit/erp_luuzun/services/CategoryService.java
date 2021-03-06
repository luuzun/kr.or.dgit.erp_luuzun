package kr.or.dgit.erp_luuzun.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.erp_luuzun.dao.CategoryMapper;
import kr.or.dgit.erp_luuzun.dao.CategoryMapperImpl;
import kr.or.dgit.erp_luuzun.dto.Category;
import kr.or.dgit.erp_luuzun.util.MyBatisSqlSessionFactory;
public class CategoryService {
	public static final CategoryService instance = new CategoryService();
	private CategoryService() {}
	public static CategoryService getInstance(){
		return instance;
	}
	
	public List<Category> selectCategoryByAll() {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			CategoryMapper categoryMapper = new CategoryMapperImpl(sqlSession);
			return categoryMapper.selectCategoryByAll();
		} 
	}
}
