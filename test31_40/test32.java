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

    public int[] solution2(String my_string) {
        int[] answer = new int[52];
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c >= 'a')
                answer[c - 'a' + 26]++;
            else
                answer[c - 'A']++;
        }
        return answer;
    }
}
