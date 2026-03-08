package flowControlStatements.DecisionStmt;

public class program3 {
	public static void main(String[] args) {
		int b=1;
		switch(b) {//short,int ,char, string, byte
		//b==1//Enum
		//no boolean can be passed
		
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("ok");//we can place the default block anywhere 
			//placing it at the end is just convention
		}
		
	}
}
