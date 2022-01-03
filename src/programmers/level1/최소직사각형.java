package programmers.level1;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int answer = 1;
        int max = 0;
        int min = 0;
        for(int i = 0; i<sizes.length; i++) {
            if(sizes[i][0] > sizes[i][1]) { //사이즈가 작은 길이를 sizes[i][0] 쪽으로 이동
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }

        int width = 0;
        int height = 0;
        for(int i = 0; i<sizes.length; i++) {
            width = Math.max(width, sizes[i][0]); //가로 중에서 가장 큰수
            height = Math.max(height, sizes[i][1]); //세로중에서 가장큰수
        }
        answer = width * height;
        return answer;
    }

}
