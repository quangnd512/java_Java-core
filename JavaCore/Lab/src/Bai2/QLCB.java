package Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QLCB {
	
	private List<CanBo> canBo;
	
	public QLCB() {
		this.canBo = new ArrayList<>();
	}
	
	public void addArr(CanBo canBo) {
		this.canBo.add(canBo);
	}
	
	public void showList() {
		for (CanBo canBo2 : canBo) {
			System.out.println(canBo2.toString());
		}
    }

	public void search(String name) {
		for (CanBo canBo2 : canBo) {
			if(canBo2.getHoTen().equals(name)==true) {
				System.out.println(canBo2.toString());
			}
		}
    }
}

