package test11_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test16 {
    public int main(int n, String control) {
        char[] arr = control.toCharArray();
        for(int i=0; i < arr.length; i++) {
            if(String.valueOf(arr[i]).equals("w")) {
                n += 1;
            }else if (String.valueOf(arr[i]).equals("s")) {
                n -= 1;
            } else if(String.valueOf(arr[i]).equals("d")) {
                n += 10;
            } else if (String.valueOf(arr[i]).equals("a")) {
                n -= 10;
            }
        }

        return n;
    }

    public int solution1(int n, String control) {
        int answer = n;

        for (char ch : control.toCharArray()) {
            switch (ch) {
                case 'w':
                    answer += 1;
                    break;
                case 's':
                    answer -= 1;
                    break;
                case 'd':
                    answer += 10;
                    break;
                case 'a':
                    answer -= 10;
                    break;
                default:
                    break;
            }
        }

        return answer;
    }

    public int solution2(int n, String control) {
        return control.chars().reduce(n, (acc, c) -> acc + (c == 'w' ? 1 : c == 's' ? -1 : c == 'd' ? 10 : -10));
    }

    public int solution3(int n, String control) {
        for(char c : control.toCharArray()){
            n += c == 'w' ? 1 : c == 's' ? -1 : c == 'd' ? 10 : -10;
        }
        return n;
    }
}
