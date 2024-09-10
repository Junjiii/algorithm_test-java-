package test21_30;

public class test21 {
    public int[] main(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            for (int i = query[0]; i <= query[1] ; i++) {
                if(i%query[2] ==0) {
                    arr[i] += 1;
                }
            }
        }
        return arr;
    }


}
