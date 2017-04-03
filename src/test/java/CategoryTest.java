import java.util.Collections;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.erp_luuzun.dto.Category;
import kr.or.dgit.erp_luuzun.services.CategoryService;

public class CategoryTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {}
	
	@Test //selectSalesByAll Test
	public void testSelectCategoryByAll(){
		System.out.println("\n==================SupplyComp Test==========================");
		List<Category> lists = CategoryService.getInstance().selectCategoryByAll();
		for (Category category : lists) {
			System.out.println(category);
		}
		List<Category> emptyList = Collections.emptyList();
		Assert.assertNotEquals(emptyList, lists);
		System.out.println("==========================================================\n");
	}
}
