package Bai8_II;

import java.util.ArrayList;
import java.util.List;

public class QuanLy {
	List<TheMuon> theMuons;

	public QuanLy() {
		this.theMuons = new ArrayList<>();
	}
	public void add(TheMuon theMuon) {
		this.theMuons.add(theMuon);
	}
	public void hienThi() {
		for (TheMuon theMuon : theMuons) {
			System.out.println(theMuon.toString());
		}
	}
	public void remove(String phieuMuon) {
		for (TheMuon theMuon : new ArrayList<>(theMuons)) {
			if(theMuon.getMaPhieuMuon().equals(phieuMuon)) {
				this.theMuons.remove(theMuon);
			}
		}
	}
}
