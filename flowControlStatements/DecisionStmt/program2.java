package flowControlStatements.DecisionStmt;

public class program2 {
	public static void main(String[] args) {
		int num=29;
		int temp=num;
		int last=num%10;
		int first=num/10;
		int sum=last+first;
		int product=last*first;
		if(temp==(sum+product)) {
			System.out.println("special 2 digit nos");
		}
		else {
			System.out.println("not a special 2 digit");
		}
	}
}
