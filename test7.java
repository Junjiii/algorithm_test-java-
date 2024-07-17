public class test7 {
    public int main(int n) {
        int result = 0;

        if(n%2 != 0) {
            for(int i=1; i <= n; i+=2) {
                result += i;
            }
        } else if(n%2 == 0) {
            for(int i=2; i <= n; i+=2) {
                result += i*i;
            }
        }

        return result;
    }

    public int solution1(int n) {
        int answer = 0;

        for(int i = n; i >= 0; i -= 2)
            answer += (n % 2 == 0) ? i * i : i;

        return answer;
    }

    public int solution2(int n) {
        if (n % 2 == 1) {
            return (n + 1) * (n + 1) / 2 / 2;
        } else {
            return 4 * n/2 * (n/2 + 1) * (2 * n/2 + 1) / 6;
        }
    }
}
