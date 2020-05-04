package Proxy;

public class Proxy implements IMessage{
	private boolean isAdmin;
	private IMessage executor;
	
	public Proxy(String user, String pwd) {
		if ("quangnd".equals(user)&&"quang123@".equals(pwd)) {
			isAdmin = true;
			executor = new MessageUser();
		}
	}

	@Override
	public void runMessage(String message) {
		// TODO Auto-generated method stub
		if (isAdmin) {
			executor.runMessage(message);
		}else {
			System.out.println("User is failse.!");
		}
	}
	
}
