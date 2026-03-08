package Exception;

public class CheckedException {
public static void main(String[] args) {
	System.out.println("program started");
	try {
		Class.forName("");
	}
	catch(ClassNotFoundException c){
		System.out.println("eexception handled");
		
	}
	System.out.println("program ended");
}
}
