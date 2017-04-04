import java.util.Collections;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.erp_luuzun.dto.SaleDetail;
import kr.or.dgit.erp_luuzun.services.SaleDetailService;

public class SaleDetailTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {}
	
	@Test //selectByAll Test
	public void testSelectSaleDetailByAll(){
		System.out.println("\n==================SaleDetailCompTest==========================");
		List<SaleDetail> lists = SaleDetailService.getInstance().selectSaleDetailByAll();
		for (SaleDetail SaleDetail : lists) {
			System.out.println(SaleDetail);
		}
		List<SaleDetail> emptyList = Collections.emptyList();
		Assert.assertNotEquals(emptyList, lists);
		System.out.println("==========================================================\n");
	}
}
