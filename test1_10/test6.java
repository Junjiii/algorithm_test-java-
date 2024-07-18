package test1_10;

public class test6 {
    public int main(int number, int n, int m) {
        int num1 = Math.floorMod(number,n);
        int num2 = Math.floorMod(number,m);
        if(num1 == 0 && num2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public int solution1(int number, int n, int m) {
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }
}
