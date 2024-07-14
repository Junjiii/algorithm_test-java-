import java.util.ArrayList;
import java.util.List;

public class test1 {
    public static String main(String str1, String str2) {
        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");
        List<String> list = new ArrayList<>();

        for(int i=0; i < arr1.length; i++) {
            list.add(arr1[i]);
            list.add(arr2[i]);
        }

        return String.join("",list);
    }

    public String solution1(String str1, String str2) {
        String answer = "";

        // charAt() : string 형태에서 순서를 선택해 char 형태로 변환해주는 메소드

        for(int i = 0; i < str1.length(); i++){
            answer+= str1.charAt(i);
            answer+= str2.charAt(i);
        }

        return answer;
    }


    public String solution2(String str1, String str2) {
        // toCharArray : 문자열을 선택하면 Char 단위로 쪼개서 배열로 반환한다.

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        // new StringBuilder : Stirng은 변경 불가능한 문자열을 생성하지만
        //                     StringBuilder는 변경 가능한 문자열을 만들어 반환한다.

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<chars1.length; i++) {
            sb.append(chars1[i]).append(chars2[i]);
        }

        // 마무리 String 으로 변환
        return sb.toString();
    }

    public String solution3(String str1, String str2) {
        String answer = "";

        int length = str1.length();
        String[] str1arr = str1.split("");
        String[] str2arr = str2.split("");
        for (int i=0; i<length; i++) {
            answer += str1arr[i]+str2arr[i];
        }

        return answer;
    }
}
