public class test4 {
    public int main(int a, int b) {
        int num1 = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int num2 = Integer.parseInt(Integer.toString(b) + Integer.toString(a));

        return (num1 > num2) ? num1 : num2;
    }

    public int solution1(int a, int b) {
        int answer = 0;
        int aLong = Integer.parseInt(""+a+b);
        int bLong = Integer.parseInt(""+b+a);
        answer = aLong > bLong ? aLong : bLong;

        return answer;
    }

    public int solution2(int a, int b) {
        return Math.max(Integer.parseInt(a + "" + b), Integer.parseInt(b + "" + a));
    }

}
