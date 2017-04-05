package kr.or.dgit.erp_luuzun;

import java.util.List;

import kr.or.dgit.erp_luuzun.dto.JoinFromSoftware;
import kr.or.dgit.erp_luuzun.services.JoinFromSoftwareService;

public class TestMain {
	public static void main(String[] args) {
		List<JoinFromSoftware> list =JoinFromSoftwareService.getInstance().selectJoinFromSoftwareByAll();
		
		//for (JoinFromSoftware joinFromSoftware : list) {
		//	System.out.println(joinFromSoftware);
		//	System.out.println("=============");
		//}
		System.out.println(list.get(1).getSale().get(0).getSoftware().getSwName());
		System.out.println(list.get(1).getSale().get(1).getSoftware().getSwName());
		System.out.println(list.get(2).getSale().get(0).getSoftware().getSwName());
		System.out.println(list.get(3).getSale().get(0).getSoftware().getSwName());
		System.out.println(list.get(4).getSale().get(0).getSoftware().getSwName());
		System.out.println(list.get(5).getSale().get(0).getSoftware().getSwName());
	}
}
