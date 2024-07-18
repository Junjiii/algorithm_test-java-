package test1_10;

import java.util.Map;
import java.util.function.BiFunction;

//  Day4 - 조건 문자열
public class test8 {
    public int main(String ineq, String eq, int n, int m) {
        if(eq.equals("=") && n == m ) return 1;
        if(ineq.equals("<") && n < m) return 1;
        if(ineq.equals(">") && n > m) return 1;
        return 0;
    }

    public int solution1(String ineq, String eq, int n, int m) {
        // 1. Map < 문자열 , 함수 > 변수 이름 = Map.of( key1, value1 ( () -> {} ) , ......)
        // 2. BiFunction< 인자 1, 인자 2, 반환값 >    -> value 에 들어가는 값
        // 3. function.get(ineq + eq) : 4개의 key 를 넣어 알맞는 함수를 반환
        // 4. .apply(n,m) : 반환된 함수에 n,m 을 넣어서 true, false 를 반환
        // 5. 삼항연산자 활용해 true 면 1 , false 면 0 을 return
        Map<String, BiFunction<Integer, Integer, Boolean>> functions = Map.of(
                ">=", (a, b) -> a >= b,
                "<=", (a, b) -> a <= b,
                ">!", (a, b) -> a > b,
                "<!", (a, b) -> a < b
        );

        return functions.get(ineq + eq).apply(n, m) ? 1 : 0;
    }

    public int solution2(String ineq, String eq, int n, int m) {
        boolean answer = false;
        if (ineq.equals(">") && eq.equals("="))
            answer = n >= m;
        else if (ineq.equals("<") && eq.equals("="))
            answer = n <= m;
        else if (ineq.equals(">") && eq.equals("!"))
            answer = n > m;
        else
            answer = n < m;
        return answer ? 1 : 0;
    }

    public int solution3(String ineq, String eq, int n, int m) {
        boolean answer = false;

        switch(eq) {
            case "!":
                switch(ineq) {
                    case "<":
                        answer = n < m;
                        break;
                    case ">":
                        answer = n > m;
                        break;
                }
                break;
            case "=":
                switch(ineq) {
                    case "<":
                        answer = n <= m;
                        break;
                    case ">":
                        answer = n >= m;
                        break;
                }
                break;
        }

        return answer?1:0;
    }
}
