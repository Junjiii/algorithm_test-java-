package test1_10;

import java.util.Arrays;
import java.util.stream.Collectors;


// 문자 리스트를 문자열로 변환하기
public class test2 {
    public String main (String[] arr) {
        return String.join("", arr);
    }

    public String solution(String[] arr) {
        return Arrays.stream(arr).collect(Collectors.joining());
    }
}
