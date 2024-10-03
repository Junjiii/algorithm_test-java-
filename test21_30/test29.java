package test21_30;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class test29 {
    public String[] solution(String my_string) {
        ArrayList<String> result = new ArrayList<>();
        int length = my_string.length();
        IntStream.range(0,my_string.length()).forEach(i -> result.add(my_string.substring(i,length)));
        return result.stream().sorted().toArray(String[]::new);
    }

    public String[] solution2(String myString) {
        return IntStream.range(0, myString.length()).mapToObj(myString::substring).sorted().toArray(String[]::new);
    }
}
