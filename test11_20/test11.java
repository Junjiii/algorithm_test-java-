package test11_20;

import java.util.stream.IntStream;

public class test11 {

    public int main(int a, int d, boolean[] included) {
        return IntStream.range(0, included.length)
                .filter(i -> included[i])
                .map(i -> a + d * i)
                .sum();
    }

    public int solution1(int a, int d, boolean[] included) {
        return IntStream.range(0, included.length).map(idx -> included[idx]?a+(idx*d):0).sum();
    }

    // 속도면에서는 solution2 가 더 빠름
    public int solution2(int a, int d, boolean[] included) {
        int answer = 0;

        for(int i = 0; i < included.length; i++){
            if(included[i]){
                answer +=  a + (d*i);
            }
        }

        return answer;
    }
}
