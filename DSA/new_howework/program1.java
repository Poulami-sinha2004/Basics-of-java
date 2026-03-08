package DSA.new_howework;
import java.util.*;

class Activity {
    int start, end;

    Activity(int s, int e) {
        start = s;
        end = e;
    }
}

public class program1 {

    public static void main(String[] args) {

        Activity[] arr = {
            new Activity(1, 2),
            new Activity(3, 4),
            new Activity(0, 6),
            new Activity(5, 7),
            new Activity(8, 9),
            new Activity(5, 9)
        };
        Arrays.sort(arr, (a, b) -> a.end - b.end);
        int count = 1;
        int lastEnd = arr[0].end;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].start >= lastEnd) {
                count++;
                lastEnd = arr[i].end;
            }
        }
        System.out.println("Maximum activities: " + count);
    }
}