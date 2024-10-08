package test31_40;

import java.util.Arrays;
import java.util.stream.IntStream;

public class test33 {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] tmp = my_string.split("");

        for (int i = 0; i < indices.length; i++) {
            tmp[indices[i]] = "";
        }

        for (String x : tmp) {
            answer += x;
        }
        return answer;
    }

    public String solution2(String my_string, int[] indices) {
        String[] str = my_string.split("");
        for (int i=0;i<indices.length;i++) str[indices[i]] = "";
        return String.join("",str);
    }
}
