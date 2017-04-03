import java.util.Collections;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.erp_luuzun.dto.Category;
import kr.or.dgit.erp_luuzun.dto.Client;
import kr.or.dgit.erp_luuzun.services.ClientService;

public class ClientTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {}
	
	@Test //selectByAll Test
	public void testSelectClientByAll(){
		System.out.println("\n==================ClientCompTest==========================");
		List<Client> lists = ClientService.getInstance().selectClientByAll();
		for (Client client : lists) {
			System.out.println(client);
		}
		List<Client> emptyList = Collections.emptyList();
		Assert.assertNotEquals(emptyList, lists);
		System.out.println("==========================================================\n");
	}
}
