import java.util.*;
//public class subarray {
//public static void main(String[] args) {
//	Scanner sc= new Scanner(System.in);
//	int [] arr= {1,2,3,4,5};
//	int n=arr.length;
//	int m=sc.nextInt();
////	int[] substr= {2,3,4};
//	ArrayList<Integer>ar=new ArrayList<>();
//	for(int i=0;i<m;i++) {
//		ar.add(sc.nextInt());
//	}
//	//2,3,4
//	int j=0;
//	boolean present=true;
//	for(int i=0;i<n;i++) {
//		if(j<m) {
//			if(arr[i]==ar.get(j++)) {
//				present=true;
//				
//			}
//			else {
//				j=0;
//				present=false;
//			}	
//			
//		}
//			
//	}
//	if(present) {
//		System.out.println("valid subarray");
//	}
//	else {
//		System.out.println("not valid");
//	}
//}
//}

public class subarray {
    public static void main(String[] args) {
        int x = 0;

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            x += i;
        }
        System.out.println(x);
    }
}