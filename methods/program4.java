package methods;

public class program4 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=2*5;j++) {
				if(j>i && j<=2*5-i) {
					System.out.print("  ");
				}
				else {
					System.out.print("* ");
				}
				
				
			}
			System.out.println();
			
				
		}
	}
}
