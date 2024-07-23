package test11_20;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class test13 {
    public int main(int[] num_list) {
        int num1 = Arrays.stream(num_list).reduce(1,(a,b) -> a * b);
        int num2 = Arrays.stream(num_list).sum();

        return num1 < num2*num2 ? 1 : 0;
    }


    public int solution1(int[] numList) {
        return (Arrays.stream(numList).reduce((acc, i) -> acc * i).getAsInt() < Math.pow(Arrays.stream(numList).sum(), 2)) ? 1 : 0;
    }

    public int solution2(int[] num_list) {
        int answer = 0;

        int sum  = 0;
        int mult = 1;

        for(int i : num_list) {
            sum += i;
            mult *= i;
        }

        answer = Math.pow(sum,2) > mult ? 1 : 0;

        return answer;
    }
}
