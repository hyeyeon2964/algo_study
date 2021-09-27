package test_2021;

public class nc2 {
    static int[] X = { 0, 1, 0, -1 };
    static int[] Y = { 1, 0, -1, 0 };
    static int[][] check;
    static int[] resultCnt = new int[26];

    public static void dfs(String[] maps, int i, int j, int[] alpha) {
        check[i][j] = 1;
        int alphaIndex = maps[i].charAt(j) - 'A';
        alpha[alphaIndex]++;
        for (int index = 0; index<4; index++) {
            int nx = i + X[index];
            int ny = j + Y[index];
            if ((nx>= 0 && nx < maps.length) && (ny >=0 && ny < maps[0].length())) { //주변 조건
                if (check[nx][ny] != 1 && maps[nx].charAt(ny) != '.') {
                    dfs(maps, nx, ny, alpha);
                }

            }
        }
    }

    public static void getWinner(int[] alphabet) {
        int max = 0;
        int maxCountry = 0;
        int sum=0;
        for (int i = 0; i<alphabet.length; i++) { //가장 땅이 큰 면적 카운트
            max = Math.max(max, alphabet[i]);
            sum += alphabet[i];
            if (max == alphabet[i]) {
                maxCountry = i;
            }
        }

        for (int i = 0; i<alphabet.length; i++) {
            if (alphabet[i] < max) {
                resultCnt[maxCountry] += alphabet[i];
            }
            else {
                resultCnt[i] += alphabet[i];
            }
        }

    }

    public static int solution(String[] maps) {
        int answer = 0;
        check = new int[maps.length][maps[0].length()];

        for (int i = 0; i< maps.length; i++) {
            for (int j = 0; j<check[0].length; j++) {
                int index = (int) (maps[i].charAt(j) - 'A');
                if (maps[i].charAt(j) != '.' && check[i][j] != 1) {
                    int[] alpha = new int[26];
                    dfs(maps, i, j, alpha);
                    getWinner(alpha);

                }
            }
        }
        for (int i: resultCnt ){
            answer = Math.max(answer, i);
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] maps = {
                "AABCA.QA",
                "AABC..QX",
                "BBBC.Y..",
                ".A...T.A",
                "....EE..",
                ".M.XXEXQ",
                "KL.TBBBQ"
        };

        System.out.println(solution(maps));
    }

}
