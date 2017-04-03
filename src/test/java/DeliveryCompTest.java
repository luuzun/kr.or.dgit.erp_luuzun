import java.util.Collections;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.erp_luuzun.dto.Delivery;
import kr.or.dgit.erp_luuzun.dto.SupplyCompany;
import kr.or.dgit.erp_luuzun.services.DeliveryService;
import kr.or.dgit.erp_luuzun.services.SupplyCompService;

public class DeliveryCompTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {}
	
	@Test //selectSalesByAll Test
	public void testDeliveryCompByAll(){
		System.out.println("\n=================DeliveryComp Test========================");
		List<Delivery> lists = DeliveryService.getInstance().selectDeliveryByAll();
		for (Delivery delivery : lists) {
			System.out.println(delivery);
		}
		List<Delivery> emptyList = Collections.emptyList();
		Assert.assertNotEquals(emptyList, lists);
		System.out.println("==========================================================\n");
	}
}
