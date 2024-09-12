package test21_30;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class test23 {
    public static void main(String[] args) {
        int[] result = solution(10);

    }


    public static int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n);

        while(n > 1) {
            if(n%2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            list.add(n);
        }

        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }


    public int[] solution2(int n) {
        return IntStream.concat(
                        IntStream.iterate(n, i -> i > 1, i -> i % 2 == 0 ? i / 2 : i * 3 + 1),
                        IntStream.of(1))
                .toArray();
    }
}
