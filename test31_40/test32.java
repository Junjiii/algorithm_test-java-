package test31_40;

import java.util.Arrays;
import java.util.stream.IntStream;

public class test32 {

    public int[] solution(String my_string) {
        String al = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int[] arr = new int[52];
        char[] charArray = my_string.toCharArray();
        IntStream.range(0,my_string.length()).forEach(i -> arr[al.indexOf(charArray[i])] += 1);

        return arr;
    }
}
