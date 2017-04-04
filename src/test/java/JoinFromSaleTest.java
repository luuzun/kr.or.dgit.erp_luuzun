import java.util.Collections;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.erp_luuzun.dto.JoinFromSale;
import kr.or.dgit.erp_luuzun.dto.Software;
import kr.or.dgit.erp_luuzun.services.JoinFromSaleService;

public class JoinFromSaleTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {}
	
	@Test //selectByAll Test
	public void testSelectJoinFromSaleByAll(){
		System.out.println("\n==================JoinFromSale Test==========================");
		List<JoinFromSale> lists = JoinFromSaleService.getInstance().selectJoinFromSaleByAll();
		for (JoinFromSale joinFromSale : lists) {
			System.out.println(joinFromSale);
		}
		List<JoinFromSale> emptyList = Collections.emptyList();
		Assert.assertNotEquals(emptyList, lists);
		System.out.println("==========================================================\n");
	}
}
