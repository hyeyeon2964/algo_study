package test_2022;

/*
check 배열에 해당 길이가 있는 road 인덱스를 넣음
만약 가장 check배열의 값과 현재 road인덱스가 k 이상이라면 그 전 인덱스까지 한 그룹

 */
public class kabang3 {

    public static int solution(int[][] tower, int k) {
        int answer = 0;
        int[] road = new int[501]; //길에 송전탑 저장해놓는 배열
        int[] check = new int[11]; //송전탑 길이 배열
        int end = 0;

        for(int i = 0; i<tower.length; i++) {
            road[tower[i][0]] = tower[i][1];
            end = tower[i][0];
        }

        for(int i = 0; i<=end; i++) {
            int height = road[i];
            if(height == 0)
                continue;
            if(check[height] == 0) {
                check[height] = i;
            }
            else {
                if(i - check[height] > k) {
                    answer++;
                }
                check[height] = i;
            }
        }
        for(int i = 1; i<11; i++) { //만약 check배열이 0이 아니라면 한 그룹인거니 그것도 체크해주기
            if(check[i] != 0)
                answer++;
        }

        return answer;
    }
    public static void main(String[] args) {
        int[][] tower = {{0,2},{2,3},{3,2},{5,3},{6,2},{7,3},{9,4},{10,2},{11,2},{12,4},{14,2},{15,3},{16,2}};
        System.out.println(solution(tower, 3));
    }
}
