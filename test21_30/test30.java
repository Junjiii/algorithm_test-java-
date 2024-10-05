package test21_30;

import java.util.Arrays;
import java.util.stream.IntStream;

public class test30 {
    public int solution(String number) {
        return number.chars().map(c -> (c - '0') % 9).sum() % 9;
    }
}
