import java.util.Collections;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.erp_luuzun.dto.Sale;
import kr.or.dgit.erp_luuzun.services.SaleService;

public class SaleTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {}
	
	@Test //selectByAll Test
	public void testSelectSaleByAll(){
		System.out.println("\n==================SaleCompTest==========================");
		List<Sale> lists = SaleService.getInstance().selectSaleByAll();
		for (Sale Sale : lists) {
			System.out.println(Sale);
		}
		List<Sale> emptyList = Collections.emptyList();
		Assert.assertNotEquals(emptyList, lists);
		System.out.println("==========================================================\n");
	}
}
