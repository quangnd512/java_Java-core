package Cau6;

public class CTivi {
	private String[] chanelList;
	private boolean isOn;
	private String currentChanel;
	public CTivi() {
		this.chanelList = new String[3];
		chanelList[0] = "VTV1";
		chanelList[1] = "VTV2";
		chanelList[2] = "VTV3";
		this.isOn = false;
		this.currentChanel = "VTV1";
		
	}
	public CTivi(String[] chanelList) {
		this.chanelList = chanelList;
		isOn = false;
		currentChanel = chanelList[0];
		
	}
	public String searchNextChannel(boolean isForward) {
		int currenIndex = -1;
		for (int i = 0; i < chanelList.length; i++) {
			if(chanelList[i].equalsIgnoreCase(currentChanel)) {
				currenIndex = i;
				break;
			}
		}
		
		if(isForward) {
			currenIndex++;
			if (currenIndex>=chanelList.length) {
				currenIndex = 0;
			}
		}else {
			currenIndex--;
			if (currenIndex<0) {
				currenIndex = chanelList.length-1;
			}
		}
		currentChanel = chanelList[currenIndex];
		return currentChanel;
	}
	
	public void onTV() {
		isOn = true;
		System.out.println("--TV ON--");
	}
	
	public void offTV() {
		isOn = false;
		System.out.println("--TV OFF");
	}
	
	public void Switch() {
		if(isOn) {
			offTV();
		}else {
			onTV();
		}
	}
	
	public void Switch(String channel) {
		Switch();
		if (isOn) {
			boolean isFind = false;
			for (int i = 0; i < chanelList.length; i++) {
				if (chanelList[i].equalsIgnoreCase(channel)) {
					isFind = true;
					break;
				}
			}
			if (isFind) {
				currentChanel = channel;
				System.out.println("Kenh hien tai la : "+channel);
			}else {
				System.out.println("Khong tim thay kenh");
			}
		}
	}
	
	public void nextChannel() {
		if (isOn) {
			searchNextChannel(true);
			System.out.print("Current Channel: "+currentChanel);
		}
	}
	
	public void prevChannel() {
		if (isOn) {
			searchNextChannel(false);
			System.out.print("Current Channel: "+currentChanel);
		}
	}
	
	public void show() {
		if (isOn) {
			System.out.printf("-- Tivi is on  as channel %s --",currentChanel);
		}else {
			System.out.print("-- Tivi is off --");
		}
	}
}
