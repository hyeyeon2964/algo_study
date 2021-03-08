package test;

public class test1 {
    public void sqarue(int n)
    {
        int[][] arr = new int[n][n];
        int num = 1;
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++){
                arr[j][i] = num++;
            }
        }
    }
}
