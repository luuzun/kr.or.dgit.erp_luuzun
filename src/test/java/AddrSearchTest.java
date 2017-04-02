import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.erp_luuzun.dto.Address;
import kr.or.dgit.erp_luuzun.services.AddrService;

public class AddrSearchTest {
	private static AddrService addrService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		addrService = new AddrService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		addrService= null;
	}

	@Test
	public void testSearch() {
		Address address= new Address();
		address.setSido("대구광역시");
		address.setDoro("상화로");
		List<Address> list= new ArrayList<>();
		list = addrService.searchSido(address);
		List<Address> emplist = Collections.emptyList();
		System.out.println(list);
		Assert.assertNotEquals(emplist, list);
	}
}