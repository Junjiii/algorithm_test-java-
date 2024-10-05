package test21_30;

import java.util.Arrays;
import java.util.stream.IntStream;

public class test30 {
    public int solution(String number) {
        return number.chars().map(c -> (c - '0') % 9).sum() % 9;
    }

    public int solution2(String number) {
        int answer = 0;

        for(int i=0; i<number.length(); i++) {
            answer += number.charAt(i) - '0';
        }

        answer %= 9;

        return answer;
    }
}
