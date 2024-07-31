package test11_20;

public class test19 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];

        for(int i=0; i<queries.length; i++) {
            int index = 0;
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            for(int j=s; j<=e; j++) {
                if(j > k) {
                    result[index] = j;
                    break;
                }
            }
        }

        return result;
    }
}
