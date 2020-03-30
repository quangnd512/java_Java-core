package Exception_Debug_Package;

public class ByZeroException extends Exception {
	float x;
	float y;

	public ByZeroException(float x, float y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String getMessage() {
		return "Exception by zero (" + x + "/" + y + ")";
	}
}
