package test21_30;

import java.util.Arrays;

public class test25 {
    public static void main(String[] args) {
        int[] arr = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        String result = solution("cvsgiorszzzmrpaqpe", arr);
        System.out.println("result = " + result);
    }

    public static String solution( String my_string, int[] index_list) {
        String result = "";
        for (int i = 0; i < index_list.length; i++) {
            char ch = my_string.charAt(index_list[i]);
            result += String.valueOf(ch);
        }
        return result;
    }

    public String solution2(String my_string, int[] index_list) {

        StringBuilder sb = new StringBuilder();

        for (int idx : index_list)
            sb.append(my_string.charAt(idx));

        return sb.toString();
    }

    public String solution3(String myString, int[] indexList) {
        return Arrays.stream(indexList).mapToObj(operand -> String.valueOf(myString.charAt(operand))).collect(Collectors.joining());
    }


}
