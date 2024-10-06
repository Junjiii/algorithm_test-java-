package test31_40;

public class test31 {
    public String solution(String my_string, int s, int e) {
        String str1 = my_string.substring(0, s);
        String reverseStr = new StringBuffer(my_string.substring(s, e+1)).reverse().toString();
        String str2 = my_string.substring(e+1);

        return str1 + reverseStr + str2;
    }
}
