package test31_40;

public class test31 {
    public String solution(String my_string, int s, int e) {
        String str1 = my_string.substring(0, s);
        String reverseStr = new StringBuffer(my_string.substring(s, e+1)).reverse().toString();
        String str2 = my_string.substring(e+1);

        return str1 + reverseStr + str2;
    }

    public String solution2(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder(my_string.substring(s, e + 1));
        answer.reverse();
        return my_string.substring(0, s) + answer + my_string.substring(e + 1);
    }

    public String solution3(String my_string, int s, int e) {

        char[] spell = my_string.toCharArray();

        for (int i = s; i < e; i++, e--) {
            char tmp = spell[i];
            spell[i] = spell[e];
            spell[e] = tmp;
        }

        String answer = "";
        for (char c : spell) {
            answer += c;
        }
        return answer;
    }
}
