package test21_30;


import java.util.stream.IntStream;

public class test22 {
    public int[] solution(int start_num, int end_num) {
        int[] arr = new int[end_num - start_num + 1];
        for (int i = 0 ; i < arr.length; i++) {
            arr[i] = start_num + i;
        }
        return arr;
    }


    public int[] solution2(int start, int end) {
        return IntStream.rangeClosed(start, end).toArray();
    }
}
