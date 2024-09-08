package test11_20;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class test20 {

    public int[] main(int[] num_list) {
        int[] arr = new int[num_list.length+1];

        for(int i=0; i < num_list.length; i++){
            arr[i] = num_list[i];
        }

        int end = num_list[num_list.length - 1];
        int second = num_list[num_list.length - 2];

        arr[num_list.length] = end > second ? end - second : end * 2;

        return arr;
    }

    public int[] solution1(int[] num_list) {
        return IntStream.iterate(0, i -> i + 1)
                .limit(num_list.length + 1)
                .map(i -> i == num_list.length ? (num_list[i - 1] > num_list[i - 2] ? num_list[i - 1] - num_list[i - 2] : 2 * num_list[i - 1]) : num_list[i])
                .toArray();
    }

}
