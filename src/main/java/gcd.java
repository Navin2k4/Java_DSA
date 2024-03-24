import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = { 2, 4, 7, 10, 15, 16 };
        int k = 4;
        ArrayList<Integer> list = new ArrayList<>();
        findgcd(arr, list, k);
        Collections.sort(list);
        System.out.println(list.get(list.size() - 1));
        scanner.close();
    }

    static void findgcd(int[] arr, ArrayList<Integer> list, int k) {
        for (int i = 0; i < arr.length; i++) {
            list.add(gcdM(k, arr[i]));
        }
    }

    static int gcdM(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdM(b, a % b);
    }
}
