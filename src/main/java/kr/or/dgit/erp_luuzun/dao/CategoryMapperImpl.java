package kr.or.dgit.erp_luuzun.dao;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.erp_luuzun.dto.Category;

public class CategoryMapperImpl implements CategoryMapper{
	private SqlSession sqlSession;
	private static final Log log = LogFactory.getLog(CategoryMapperImpl.class);
	private String nameSpace = "kr.or.dgit.erp_luuzun.dao.CategoryMapper.";

	public CategoryMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Category> selectCategoryByAll() {
		log.debug("selectCategoryByAll()");
		return sqlSession.selectList(nameSpace + "selectCategoryByAll");
	}
}
