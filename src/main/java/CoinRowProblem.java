import java.util.ArrayList;

public class CoinRowProblem {
    public static void main(String[] args) {
        int arr[] = { 5, 1, 2, 10, 6, 2 };
        int res = findMax(arr);
        System.out.println(res);
    }

    static int findMax(int[] newcoin) {
        int coin[] = new int[newcoin.length + 1];
        coin[0] = 0;
        for (int i = 0; i < newcoin.length; i++) {
            coin[i + 1] = newcoin[i];
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < coin.length; i++) {
            if (i == 0) {
                list.add(0);
            } else if (i == 1) {
                list.add(coin[i]);
            } else {
                int value = findval(coin, list, i);
                list.add(value);
            }
        }
        return list.get(list.size() - 1);
    }

    static int findval(int[] coin, ArrayList<Integer> list, int i) {
        int a = coin[i] + list.get(i - 2);
        int b = list.get(i - 1);
        return max(a, b);
    }

    static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

}
