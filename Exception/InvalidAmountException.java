package Exception;

public class InvalidAmountException extends RuntimeException{
	public InvalidAmountException(String msg) {
		super(msg);
	}
}