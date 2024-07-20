package test1_10;

public class test10 {
    public String main(String code) {
        int mode = 0;
        char[] strToChar = code.toCharArray();
        StringBuilder ret = new StringBuilder();

        for(int i=0; i < strToChar.length; i++) {
            if(mode == 0) {
                if(String.valueOf(strToChar[i]).equals("1")) {
                    mode += 1;
                } else if(i%2 == 0) {
                    ret.append(strToChar[i]);
                }
            } else if(mode == 1) {
                if(String.valueOf(strToChar[i]).equals("1")) {
                    mode -= 1;
                } else if(i%2 != 0) {
                    ret.append(strToChar[i]);
                }
            }
        }
        return ret.length() == 0 ? "EMPTY" : ret.toString() ;
    }

    public String solution1(String code) {
        StringBuilder answer = new StringBuilder();
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            char current = code.charAt(i);
            if (current == '1') {
                mode = mode == 0 ? 1 : 0;
                continue;
            }

            if (i % 2 == mode) {
                answer.append(current);
            }
        }
        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }


}
