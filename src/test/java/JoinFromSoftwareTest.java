import java.util.Collections;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.erp_luuzun.dto.JoinFromSoftware;
import kr.or.dgit.erp_luuzun.services.JoinFromSoftwareService;

public class JoinFromSoftwareTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {}
	
	@Test //selectByAll Test
	public void testSelectJoinFromSoftwareByAll(){
		System.out.println("\n==================JoinFromSoftware Test==========================");
		List<JoinFromSoftware> lists = JoinFromSoftwareService.getInstance().selectJoinFromSoftwareByAll();
		for (JoinFromSoftware joinFromSoftware : lists) {
			System.out.println(joinFromSoftware);
		}
		List<JoinFromSoftware> emptyList = Collections.emptyList();
		Assert.assertNotEquals(emptyList, lists);
		System.out.println("==========================================================\n");
	}
}
