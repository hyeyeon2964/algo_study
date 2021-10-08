package baekjoon.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 * [upper bound 방식]
 * int[] tree : 입력받은 나무들의 높이가 저장되어있는 배열(정렬할 필요 없음)
 * min : 하한선 변수로 초기값은 0
 * max : tree 에 저장 된 나무들 중 가장 큰 나무의 높이
 */
public class 나무자르기 {
    static int[] tree;

    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //나무의 수
        int m = Integer.parseInt(st.nextToken()); //가져가야하는 나무의 길이
        int max = 0;
        int min = 0;
        tree = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i<n; i++){
            tree[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, tree[i]); //최대값 찾기
        }

        while (min < max) {
            int mid = (max + min) / 2;
            long sum = 0;
            for (int treeHeight : tree) {
                /*
                 *  tree의 잘린 길이 = tree의 높이 - 자르는 위치(mid)
                 *  tree의 잘린 길의의 합을 구한다.
                 *  이 때 자르는 위치가 주어진 나무의 높이보다 클 수 있기 때문에
                 *  0 이하인 경우(=음수)에는 합산을 하지 않고 양수만 합산하도록 해야한다.
                 */

                if (treeHeight - mid > 0) {
                    sum += (treeHeight - mid);
                }
            }
            if (sum < m) { // M이 길면 현재 mid가 높다는 말 mid를 낮춰야함
                max = mid ;
            }
            else {
                min = mid + 1; //M이 작다는건 너무 많이 잘랐다는 뜻 min을 높임
            }
        }
        System.out.println(min - 1);
    }
}
