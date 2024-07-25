package test11_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test14 {

    public int main(int[] num_list) {
        List<String> odd = new ArrayList<>();
        List<String> even = new ArrayList<>();

        Arrays.stream(num_list)
                .forEach( i -> {
                    if(i %2 == 0) {
                        odd.add(Integer.toString(i));
                    } else {
                        even.add(Integer.toString(i));
                    }

                });


        return Integer.parseInt(String.join("",odd)) +  Integer.parseInt(String.join("",even));
    }

    public int solution1(int[] num_list) {
        int answer = 0;

        int even = 0;
        int odd = 0;

        for(int num : num_list) {
            if(num % 2 == 0) {
                even *= 10;
                even += num;
            } else {
                odd *= 10;
                odd += num;
            }
        }
        answer = even + odd;

        return answer;
    }

    public int solution2(int[] numList) {
        return Integer.parseInt(Arrays.stream(numList).filter(value -> value % 2 != 0).mapToObj(String::valueOf).collect(Collectors.joining())) + Integer.parseInt(Arrays.stream(numList).filter(value -> value % 2 == 0).mapToObj(String::valueOf).collect(Collectors.joining()));
    }

    public int solution3(int[] num_list) {
        String jjaksu = "";
        String holsu = "";

        for(int num : num_list) {
            if(num % 2 == 0) {
                jjaksu += num + "";
            } else {
                holsu += num + "";
            }
        }

        return Integer.parseInt(jjaksu) + Integer.parseInt(holsu);
    }
}
