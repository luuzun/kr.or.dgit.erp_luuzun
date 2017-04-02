import java.util.Collections;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.erp_luuzun.dto.SupplyCompany;
import kr.or.dgit.erp_luuzun.services.SupplyCompService;

public class SupplyCompTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {}
	
	@Test //selectSalesByAll Test
	public void testSelectSupplyCompByAll(){
		List<SupplyCompany> lists = SupplyCompService.getInstance().selectSupplyCompByAll();
		for (SupplyCompany supplyCompany : lists) {
			System.out.println(supplyCompany);
		}
		List<SupplyCompany> emptyList = Collections.emptyList();
		Assert.assertNotEquals(emptyList, lists);
	}
}
