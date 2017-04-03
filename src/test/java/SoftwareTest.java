import java.util.Collections;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.erp_luuzun.dto.Category;
import kr.or.dgit.erp_luuzun.dto.Software;
import kr.or.dgit.erp_luuzun.services.SoftwareService;

public class SoftwareTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {}
	
	@Test //selectByAll Test
	public void testSelectSoftwareByAll(){
		System.out.println("\n==================Software Test==========================");
		List<Software> lists = SoftwareService.getInstance().selectSoftwareByAll();
		for (Software software : lists) {
			System.out.println(software);
		}
		List<Software> emptyList = Collections.emptyList();
		Assert.assertNotEquals(emptyList, lists);
		System.out.println("==========================================================\n");
	}
}
