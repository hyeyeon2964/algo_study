package algo_class;

public class dfs_59 {
    static int n;
    static int[] ch = new int[11];
    public static void dfs(int v) {
        if (v == n+1) {
            for (int i = 0; i<n+1; i++) {
                if (ch[i] == 1) {
                    System.out.print(i+ " ");
                }
            }
            System.out.println();
        }
        else {
            ch[v] = 1; //출력할 부분집합 1로 변경
            dfs(v+1); // 다음 레벨로 이동
            ch[v] = 0; // 다음 레벨 원소가 안들어가는 경우
            dfs(v+1); // 다음레벨로 이동
        }
    }

    public static void main(String[] args) {
        n = 3;
        dfs(1);
    }
}
