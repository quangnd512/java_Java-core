package Singleton;

import java.util.ArrayList;
import java.util.List;

public class PersionMgr {
	List<Nguoi> persionList = new ArrayList<>();
	private static PersionMgr instance = null; 
	
	public static PersionMgr getInstance() {
		if (instance==null) {
			instance = new PersionMgr();
		}
		return instance;
	}
	
	private PersionMgr() {
		
	}
	
	public void add(Nguoi nguoi) {
		this.persionList.add(nguoi);
	}
	
	public void show() {
		for (Nguoi nguoi : persionList) {
			nguoi.titlePersion();
		}
	}
}
