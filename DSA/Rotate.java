package DSA;

public class Rotate {
    public static void main(String[] args) {

        int[] arr = {10, 60, 20, 40, 30};
        int n = arr.length;

        int[] arr1 = new int[n];
        int[] arr2 = new int[n]; 

        int key = 2;
      int k = 0;
        int pos = n - key;  

        for (int i = pos; i < n; i++) {
            arr1[k++] = arr[i];
        }

        for (int i = 0; i < pos; i++) {
            arr1[k++] = arr[i];
        }

        k = 0;   

        for (int i = key; i < n; i++) {
            arr2[k++] = arr[i];
        }

        for (int i = 0; i < key; i++) {
            arr2[k++] = arr[i];
        }

      
        System.out.print("Right Shift: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr1[i] + " ");

        System.out.println();

        System.out.print("Left Shift: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr2[i] + " ");
    }
}
