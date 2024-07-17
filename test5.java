public class test5 {
    public int main(int num, int n) {
        return Math.floorMod(num,n) == 0 ? 1 : 0 ;
    }

    public int solution1(int num, int n) {
        int answer = num % n == 0 ? 1 : 0;
        return answer;
    }
}
