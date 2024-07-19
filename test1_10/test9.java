package test1_10;

public class test9 {
    public int main(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }

    public int solution1(int a, int b, boolean flag) {
        return a + (flag ? 1 : -1) * b;
    }
}
