package programmers.level2;

public class 월코2 {
    public int[] solution(int n) {
        int[] answer = {};

        int[][] arr = new int[n][n];
        int ct = n;
        int value = 1;
        int line = -1;
        int row = 0;

        while ( true ) {
            if ( ct <= 0 ) break;
            //위에서 → 왼쪽 아래로 이동
            for ( int i=0 ; i < ct ; i++) {
                arr[line++][row] = value++;


            }
            ct--; // 이동 횟수 감소
            row++;
            //오른쪽 에서 → 왼쪽으로 이동
            if ( ct <= 0 ) break;
            for ( int i=0 ; i < ct ; i++) {
                arr[line][++row] = value++;
            }
            ct--;
            //왼쪽에서 → 위로 이동
            if ( ct <= 0 ) break;
            for ( int i=0 ; i < ct ; i++) {
                arr[--line][row] = value++;
            }
            line++;row++;
            ct--;
        }

        int index = 0;
        answer = new int[value];
        for(int i = 0; i<n; i++){
            for(int j= 0; j<=i; j++){
                answer[index] = arr[i][j];
            }
        }
        return answer;
    }

}