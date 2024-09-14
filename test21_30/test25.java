package test21_30;

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
}
