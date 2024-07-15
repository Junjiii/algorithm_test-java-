public class test3 {

    public String main(String my_string, int k) {
        // StringBuilder 로 변형 가능한 문자열 생성
        StringBuilder sb = new StringBuilder();

        // parameter k 만큼 반복
        for(int i=0; i<k; i++) {
            sb.append(my_string);
        }

        // 문자열로 변형해 반환
        return sb.toString();
    }

    public String solution(String my_string, int k) {
        // repeat() 메소드로 k 만큼 반복 후 반환
        return my_string.repeat(k);
    }


}
