package test21_30;

import java.util.*;

public class test24 {

    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);
        if (map.size() == 1) return a * 1111;
        if (map.size() == 2) {
            if (map.containsValue(3)) {
                for (Map.Entry<Integer, Integer> el : map.entrySet())
                    answer += el.getKey() * (el.getValue() == 3 ? 10 : 1);
                return answer * answer;
            }
            int x = (a + b + c + d - 2 * a) / 2;
            return (a + x) * Math.abs(a - x);
        }
        if (map.size() == 3) {
            answer = 1;
            for (Map.Entry<Integer, Integer> el : map.entrySet())
                if (el.getValue() != 2) answer *= el.getKey();
            return answer;
        }
        return Math.min(Math.min(a, b), Math.min(c, d));
    }

    public int solution2(int a, int b, int c, int d) {

        int[] dice = { a, b, c, d };
        Arrays.sort(dice);

        int ans = 0;

        if (dice[0] == dice[3]) {
            ans = 1111 * dice[3];
        } else if (dice[0] == dice[2] || dice[1] == dice[3]) {
            ans = (int) Math.pow(dice[1] * 10 + (dice[0] + dice[3] - dice[1]), 2);
        } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
            ans = (dice[0] + dice[3]) * (dice[3] - dice[0]);
        } else if (dice[0] == dice[1]) {
            ans = dice[2] * dice[3];
        } else if (dice[1] == dice[2]) {
            ans = dice[0] * dice[3];
        } else if (dice[2] == dice[3]) {
            ans = dice[0] * dice[1];
        } else {
            ans = dice[0];
        }

        return ans;
    }
}

