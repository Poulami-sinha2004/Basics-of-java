import java.util.*;
public class longestsubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int maxcount = 0;
        for (int i = 0; i < n; i++) {
            ArrayList<Character> ar = new ArrayList<>(); 
            int count = 0;
            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                if (!ar.contains(c)) {
                    ar.add(c);
                    count++;
                } else {
                   
                    break;
                }
            }
            if (maxcount < count) {
                maxcount = count;
            }
        }
        System.out.println(maxcount);
    }
}