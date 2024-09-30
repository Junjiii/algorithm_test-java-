package test21_30;

import java.util.Arrays;

public class test27 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        return Arrays.stream(intStrs)
                .mapToInt(e -> Integer.parseInt(e.substring(s, s+l)))
                .filter(e -> e > k)
                .toArray();
    }
}
