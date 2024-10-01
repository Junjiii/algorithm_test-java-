package test21_30;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class test28 {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder result = new StringBuilder();
        AtomicInteger atomicInteger = new AtomicInteger(0);

        Arrays.stream(my_strings).forEach(e -> {
            int index = atomicInteger.getAndIncrement();
            result.append(e.substring(parts[index][0],parts[index][1] + 1));
        });

        return result.toString();
    }

    public String solution2(String[] my_strings, int[][] parts) {
        String answer = "";

        for(int i = 0; i < parts.length; i ++){
            answer += my_strings[i].substring(parts[i][0], parts[i][1] + 1);
        }

        return answer;
    }


    // collect(Collectors.joining())  사용해보기
    public String solution3(String[] myStrings, int[][] parts) {
        return IntStream.range(0, myStrings.length).mapToObj(i -> myStrings[i].substring(parts[i][0], parts[i][1] + 1)).collect(Collectors.joining());
    }
}
