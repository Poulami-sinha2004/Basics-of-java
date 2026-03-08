import java.util.*;
public class Duplicate_elements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> ar= new ArrayList<>();
		HashSet<Integer> hs= new HashSet<>();
		HashSet<Integer> hs1= new HashSet<>();
		int n=sc.nextInt();
		System.out.println("enter elements");
		
		for(int i=0;i<n;i++) {
			ar.add(sc.nextInt());
		}
		for(int i=0;i<ar.size();i++) {
			if(!hs.contains(ar.get(i))) {
				hs.add(ar.get(i));
			}
			else {
				
				hs1.add(ar.get(i));
			}
				
		}
		System.out.println(hs1);
	}

}
